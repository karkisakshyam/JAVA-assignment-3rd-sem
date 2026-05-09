// WAP showing Vector and Stack

import java.util.Stack;
import java.util.Vector;

public class VectorStackDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);

        System.out.println("Vector: " + v);
        System.out.println("Stack: " + s);

        System.out.println("Popped Element: " + s.pop());
    }
}