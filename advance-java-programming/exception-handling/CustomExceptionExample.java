import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    static void validateAge(int age) throws InvalidInputException {
        if (age < 18 || age > 60) {
            throw new InvalidInputException(
                "Invalid age! Age must be between 18 and 60."
            );
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);

            System.out.println("Valid age entered: " + age);

        } catch (InvalidInputException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Please enter a valid numeric value.");
        }

        sc.close();
    }
}