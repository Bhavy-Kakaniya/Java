class DarshanUniException extends Exception {
    public DarshanUniException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            // Example condition — you can replace it with any logic
            String studentName = "Bhavy";
            int marks = 25;

            if (marks < 35) {
                // Throw custom exception
                throw new DarshanUniException(studentName + " has failed! Marks below passing criteria.");
            }

            System.out.println("✅ " + studentName + " has passed successfully!");
        } 
        catch (DarshanUniException e) {
            // Catch and display the custom exception message
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
