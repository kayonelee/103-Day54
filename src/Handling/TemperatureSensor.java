package Handling;

import java.lang.Math;

public class TemperatureSensor implements Sensor{

    boolean on = false;

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if(!on) {
            throw new IllegalStateException("Handling Sensor must be on");
        }
        return (int)(Math.random() * (30 - (-30) + 1) + (-30));
    }
    public static void main(String[] args) {

        //PART2
        System.out.println("PRACTICE HANDLING: Part 2");
        System.out.println();

        TemperatureSensor t = new TemperatureSensor();
        t.setOn();
        System.out.println(t.read());
    }
}
//Create a class TemperatureSensor that implements the Sensor interface.
//At first a temperature sensor is off. When the method read is called
// and the sensor is on, the sensor randomly chooses an integer in the
// range -30...30 and returns it. If the sensor is off, the method read
// throws an IllegalStateException.