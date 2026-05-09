// 1. WAP to handle the exception using try, catch and throw.
public class TryCatchThrow {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}