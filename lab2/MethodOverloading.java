// WAP showing method overloading (compile time polymorphism).
public class MethodOverloading {
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }

    public void display(int num) {
        System.out.println("Number: " + num);
    }

    public void display(String msg, int num) {
        System.out.println(msg + " " + num);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display("Hello");
        obj.display(100);
        obj.display("Value is", 50);
    }
}