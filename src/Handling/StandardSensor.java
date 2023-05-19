package Handling;

public class StandardSensor implements Sensor {

    int number;
    boolean on;

    public StandardSensor(int num) {
        number = num;
        on = true;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = true;
    }

    @Override
    public int read() {
        return number;
    }

    public static void main(String[] args) {
        //PART1
        System.out.println("PRACTICE HANDLING: Part 1");
        System.out.println();

        StandardSensor ten = new StandardSensor(12);
        StandardSensor minusFive = new StandardSensor(-2);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }
}
//Create a class called StandardSensor that implements the interface Sensor.
//A standard sensor is always on. Calling the methods setOn and setOff have
//no effect. The StandardSensor must have a constructor that takes one integer
//parameter. The method call read returns the number that was given to the constructor.
