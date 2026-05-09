// WAP showing HashSet and TreeSet

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(40);
        hs.add(10);
        hs.add(20);

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(40);
        ts.add(10);
        ts.add(20);

        System.out.println("HashSet: " + hs);
        System.out.println("TreeSet: " + ts);
    }
}