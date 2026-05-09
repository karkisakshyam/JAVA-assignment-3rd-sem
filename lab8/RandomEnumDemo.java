// WAP to generate random numbers and also show concept of enum

import java.util.Random;

enum Day {
    SUNDAY, MONDAY, TUESDAY
}

public class RandomEnumDemo {
    public static void main(String[] args) {

        Random r = new Random();

        System.out.println("Random Number: " + r.nextInt(100));

        Day d = Day.MONDAY;

        System.out.println("Enum Value: " + d);
    }
}