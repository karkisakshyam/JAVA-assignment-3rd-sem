// 3. WAP to create a exception and handle it.
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new InvalidAgeException("Custom error: Invalid Age");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}