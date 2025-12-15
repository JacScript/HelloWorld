package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/test";

        String sql = "INSERT INTO student (rollno, name, age) VALUES (1,'jac', 26)";

        try (Connection conn = DriverManager.getConnection(url, "miles", "miles123");
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, 1);
            pst.setString(2, "Miles");
            pst.setInt(3, 26);

            int m = pst.executeUpdate();

            if (m == 1)
                System.out.println("Inserted successfully!");
            else
                System.out.println("Insertion failed!");

        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
