import java.io.*;

// 7. WAP showing Serializable and Deserializable.
class StudentData implements Serializable {
    int id = 101;
    String name = "Alice";
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(new StudentData());
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            StudentData s = (StudentData) in.readObject();
            in.close();
            System.out.println("Deserialized ID: " + s.id + ", Name: " + s.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}