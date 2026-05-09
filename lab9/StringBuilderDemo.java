// WAP showing StringBuilder class

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println(sb);

        sb.reverse();

        System.out.println("Reversed: " + sb);
    }
}