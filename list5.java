package Practical;
import java.io.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class list5 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[5];
            array[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Accessing out of bounds element.");
        }

        // NullPointerException
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Null value encountered.");
        }

        // NumberFormatException
        try {
            int number = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid conversion to integer.");
        }

        // FileNotFoundException
        try {
            File file = new File("non_existent_file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("FileNotFoundException caught: File not found.");
        }

        // Custom Exception
        try {
            checkEligibility(15);
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Resources closed.");
        }
    }

    // Method to demonstrate custom exception
    public static void checkEligibility(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("Eligible!");
        }
    }
}
