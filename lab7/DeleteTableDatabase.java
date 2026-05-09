// WAP to delete table and database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTableDatabase {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            st.executeUpdate("DROP TABLE studentdb.student");

            st.executeUpdate("DROP DATABASE studentdb");

            System.out.println("Table and Database Deleted Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}