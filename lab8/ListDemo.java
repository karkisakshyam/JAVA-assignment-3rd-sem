// WAP showing ArrayList and LinkedList

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Java");
        arr.add("Python");

        LinkedList<String> list = new LinkedList<>();
        list.add("C");
        list.add("C++");

        System.out.println("ArrayList: " + arr);
        System.out.println("LinkedList: " + list);
    }
}