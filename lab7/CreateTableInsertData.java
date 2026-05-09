// WAP to create a table and insert 5 data in it

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableInsertData {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            String createTable = "CREATE TABLE student (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "age INT)";

            st.executeUpdate(createTable);

            st.executeUpdate("INSERT INTO student VALUES(1,'Ram',20)");
            st.executeUpdate("INSERT INTO student VALUES(2,'Shyam',21)");
            st.executeUpdate("INSERT INTO student VALUES(3,'Hari',22)");
            st.executeUpdate("INSERT INTO student VALUES(4,'Sita',19)");
            st.executeUpdate("INSERT INTO student VALUES(5,'Gita',20)");

            System.out.println("Table created and 5 records inserted.");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}