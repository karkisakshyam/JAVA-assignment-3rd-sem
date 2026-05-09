// WAP to show Class and Object in Java

class Student {

    int id;
    String name;

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class ClassObjectDemo {

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Assigning values
        s1.id = 101;
        s1.name = "Ram";

        // Calling method
        s1.display();
    }
}