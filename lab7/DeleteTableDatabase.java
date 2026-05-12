import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTableDatabase {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            st.executeUpdate("DROP TABLE student");

            con.close();

            Connection con2 = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/",
                    user,
                    password
            );

            Statement st2 = con2.createStatement();

            st2.executeUpdate("DROP DATABASE studentdb");

            System.out.println("Table and Database Deleted Successfully");

            con2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}