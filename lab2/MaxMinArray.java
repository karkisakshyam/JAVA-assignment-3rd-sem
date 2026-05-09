// WAP to find maximum and minimum number from array in Java

public class MaxMinArray {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 56, 3};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Number = " + max);
        System.out.println("Minimum Number = " + min);
    }
}