// WAP to show different types of method.
public class MethodTypes {
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public int returnMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodTypes obj = new MethodTypes();
        obj.instanceMethod();
        staticMethod();
        System.out.println("Return method result: " + obj.returnMethod(5, 10));
    }
}