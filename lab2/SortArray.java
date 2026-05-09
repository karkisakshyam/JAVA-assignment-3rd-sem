import java.util.Arrays;
import java.util.Collections;

// WAP to sort an array (display in both ascending and descending order).
public class SortArray {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 6};
        
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));
        
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr));
    }
}