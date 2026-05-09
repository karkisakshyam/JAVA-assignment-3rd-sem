import java.io.IOException;

// 2. WAP to handle exception using throws
public class ThrowsDemo {
    public static void checkFile() throws IOException {
        throw new IOException("File not found error");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("Handled exception: " + e.getMessage());
        }
    }
}