import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            st.executeUpdate("UPDATE student SET address='Chitwan' WHERE id=3");

            System.out.println("Record Updated Successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}