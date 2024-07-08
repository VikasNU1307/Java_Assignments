import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

// Main class Assignment_14 to demonstrate exception handling scenarios
public class Assignment_14 {

    public static void main(String[] args) throws Exception {
        // Question 1: Generate Arithmetic Exception without handling
        int result = 10 / 0; // This will throw ArithmeticException

        // Question 2: Handle Arithmetic exception using try-catch block
        try {
            int result2 = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Question 2: Caught ArithmeticException: " + e.getMessage());
        }

        // Question 3: Method that throws exception, called without try block
        methodThatThrowsException();

        // Question 4: Program with multiple catch blocks
        try {
            int[] arr = new int[5];
            arr[6] = 10; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Question 4: Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Question 4: Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Question 4: Caught generic Exception: " + e.getMessage());
        }

        // Question 5: Throw exception with your own message
        try {
            throw new Exception("Question 5: This is a custom exception message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Question 6: Create your own exception
        try {
            throw new CustomException("Question 6: CustomException occurred");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        // Question 7: Finally block
        try {
            int result7 = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Question 7: Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Question 7: Finally block executed");
        }

        // Question 8: Generate Arithmetic Exception
        try {
            int result8 = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Question 8: Caught ArithmeticException: " + e.getMessage());
        }

        // Question 9: Generate ArrayIndexOutOfBoundException
        try {
            int[] arr9 = new int[5];
            arr9[6] = 10; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Question 9: Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Question 10: Generate ClassNotFoundException
        try {
            Class.forName("NonExistingClass"); // This will throw ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Question 10: Caught ClassNotFoundException: " + e.getMessage());
        }

        // Question 11: Generate FileNotFoundException
        try {
            throw new FileNotFoundException("Question 11: File not found");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Question 12: Generate IOException
        try {
            throw new IOException("Question 12: Input/Output Exception occurred");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Question 13: Generate NoSuchFieldException
        try {
            throw new NoSuchFieldException("Question 13: No such field found");
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }

        // Question 14: Generate NoSuchMethodException
        try {
            throw new NoSuchMethodException("Question 14: No such method found");
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }

        // Question 15: Generate NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Question 15: Caught NullPointerException: " + e.getMessage());
        }

        // Question 16: Generate NumberFormatException
        try {
            int num = Integer.parseInt("abc"); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Question 16: Caught NumberFormatException: " + e.getMessage());
        }

        // Question 17: Generate StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            char ch = str.charAt(10); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Question 17: Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }

        // Question 18: Generate SQLException
        try {
            throw new SQLException("Question 18: SQL Exception occurred");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method that throws an exception
    static void methodThatThrowsException() throws Exception {
        throw new Exception("Question 3: Exception thrown from methodThatThrowsException");
    }

    // Custom exception class
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
}
