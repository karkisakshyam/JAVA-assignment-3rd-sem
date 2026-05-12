import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            st.executeUpdate("CREATE DATABASE studentdb");

            System.out.println("Database Created Successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}