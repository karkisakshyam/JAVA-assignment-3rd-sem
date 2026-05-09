import java.io.*;

// 8. WAP to copy contents of one file to another.
public class FileCopy {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("source.txt");
            fw.write("Copy this text.");
            fw.close();

            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("destination.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}