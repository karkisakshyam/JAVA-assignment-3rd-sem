import java.io.*;

// 6. WAP to create a file, write on it and read from it using FileWriter & FileReader, FileInputStream & FileOutputStream, BufferWriter and BufferReader and BufferInputStream and BufferOutputStream.
public class ComprehensiveFileIO {
    public static void main(String[] args) {
        String file1 = "charData.txt";
        String file2 = "byteData.txt";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
            bw.write("Character Stream Data");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(file1));
            System.out.println("Read char: " + br.readLine());
            br.close();

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2));
            bos.write("Byte Stream Data".getBytes());
            bos.close();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2));
            byte[] data = new byte[bis.available()];
            bis.read(data);
            System.out.println("Read byte: " + new String(data));
            bis.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}