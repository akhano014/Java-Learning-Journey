import java.sql.*;

public class DeleteSQL{
    public static void main(String[] args) {
        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/firstjavacode",
                    "root",
                    "8787"
            );

            Statement st = conn.createStatement();

            String query = "DELETE FROM Profile WHERE student_id=3";

            int rows = st.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Record Deleted Successfully!");
            } else {
                System.out.println("No record found to delete.");
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

