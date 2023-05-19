package Handling;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    boolean on = false;
    ArrayList<Sensor> sensors = new ArrayList<>();
    List<Integer> readings = new ArrayList<>();

    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s : sensors) {
            s.setOn();
        }
        on = true;
    }

    @Override
    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }
        on = false;
    }

    @Override
    public int read() {
        if (!on || sensors.isEmpty()) {
            throw new IllegalStateException("Average sensor must be on and added to list.");
        }
        int reading = (int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        readings.add(reading);
        return reading;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }
    public static void main(String[] args) {

        //PART 3/4-AVERAGE SENSOR- ALL READINGS
        System.out.println("PRACTICE HANDLING: Part 3 & 4");
        System.out.println();

        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }

}
//Create a class called AverageSensor that implements the interface Sensor.
//An average sensor includes multiple sensors. In addition to the methods
// defined in the Sensor interface, the AverageSensor has the method public
// void addSensor(Sensor toAdd) that can be used to add a new sensor for the
// average sensor to control.
//
//An AverageSensor is on when all its sensors are on. When setOn is called,
// all the sensors must be set on. When setOff is called, at least one of
// the sensors must be set off. It's also acceptable to set off all the sensors.
//
//The method read of AverageSensor returns the average of the read methods
// of its sensors (since the return value is int, the number is rounded down
// as is the case with integer division). If this method is called while the
// AverageSensor is off, or if no sensors have been added to it, the method
// should throw an IllegalStateException.
//
//Add to the class AverageSensor the method public List<Integer> readings().
//The method should return the results of all the executed readings that the
//average sensor has done as a list.
