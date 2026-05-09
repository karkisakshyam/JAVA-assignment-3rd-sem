// 4. WAP to rethrow exceptions.
public class RethrowException {
    public static void compute() {
        try {
            int res = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught inside compute, rethrowing...");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            compute();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e);
        }
    }
}