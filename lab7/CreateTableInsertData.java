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

            String table = "CREATE TABLE student(" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "address VARCHAR(50))";

            st.executeUpdate(table);

            st.executeUpdate("INSERT INTO student VALUES(1,'Ram','Kathmandu')");
            st.executeUpdate("INSERT INTO student VALUES(2,'Shyam','Pokhara')");
            st.executeUpdate("INSERT INTO student VALUES(3,'Hari','Butwal')");
            st.executeUpdate("INSERT INTO student VALUES(4,'Sita','Lalitpur')");
            st.executeUpdate("INSERT INTO student VALUES(5,'Gita','Bhaktapur')");

            System.out.println("Table Created and 5 Records Inserted");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}