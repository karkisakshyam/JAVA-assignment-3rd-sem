// 5. WAP showing nested try catch.
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Div by zero");
            }
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Array index out of bounds");
        }
    }
}