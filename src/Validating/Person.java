package Validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if(name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be null, empty, or over 40 characters in length.");
        }
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
//PART1-The constructor of the class Person should ensure that the name given
// as the parameter is not null, empty, or over 40 characters in length. The
// age should between 0 and 120. If some of these conditions are not met,
// the constructor should throw an IllegalArgumentException.