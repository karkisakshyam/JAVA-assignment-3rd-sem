// WAP showing Queue and Dictionary

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDictionaryDemo {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("Ram");
        q.add("Hari");

        System.out.println("Queue: " + q);

        Dictionary<Integer, String> d = new Hashtable<>();

        d.put(1, "Java");
        d.put(2, "Python");

        System.out.println("Dictionary Value: " + d.get(1));
    }
}