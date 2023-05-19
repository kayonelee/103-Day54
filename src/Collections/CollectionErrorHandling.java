package Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionErrorHandling {
    public static void main(String[] args) {
        // ASSIGNMENT 1-Define a List of integers with at least one set of duplicates.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5); // DUPLICATE (#5)

        try {
            // ASSIGNMENT 2-Use a Set to remove duplicates
            Set<Integer> myNumbers = new HashSet<>(numbers);

            // ASSIGNMENT 3-Calculate the sum of the integers
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // ASSIGNMENT 3-Calculate the sum and average of the integers.
            double average = (double) sum / numbers.size();

            // ASSIGNMENT 4-Print the sum, average, and the list of integers without duplicates
            System.out.println("My original list: " + numbers);
            System.out.println();
            System.out.println("Sum of list: " + sum); //1+2+5+5+9 =22 SUM
            System.out.println();
            System.out.println("Average of list: " + average); //(1+2+5+5+9)/5 =4.4 AVERAGE
            System.out.println();
            System.out.println("List (without duplicates): " + myNumbers); //SHOULD ONLY BE [1, 2, 5, 9]
            System.out.println();

//ASSIGNMENT 5 & 6
//Handle exceptions, such as IndexOutOfBoundsException, IllegalArgumentException, and ArithmeticException.
//Use try-catch-finally and multi-catch blocks as needed.
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Illegal argument");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception");
        } finally {
            System.out.println("Java program completed, Goodbye");
        }
    }
}
