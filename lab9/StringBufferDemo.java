// WAP showing StringBuffer class

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");

        System.out.println(sb);

        sb.insert(5, " Java");

        System.out.println(sb);
    }
}