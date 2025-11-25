import java.sql.*;

public class firstjavacode {
    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/firstjavacode";
        String user = "root";
        String password = "8787";  // UPDATE THIS if you have a password

        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            System.out.println("=== STARTING DATABASE OPERATIONS ===\n");

            // Step 1: Connect to database
            System.out.println("Step 1: Attempting to connect to database...");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✓ SUCCESS! Connected to database 'firstjavacode'\n");

            // Step 2: Create table if not exists
            System.out.println("Step 2: Creating/verifying 'students' table...");
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "age INT NOT NULL, " +
                    "email VARCHAR(100) UNIQUE, " +
                    "course VARCHAR(50), " +
                    "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";

            stmt = conn.createStatement();
            stmt.executeUpdate(createTableSQL);
            System.out.println("✓ Table 'students' is ready!\n");

            // Step 3: Insert a sample record
            System.out.println("Step 3: Inserting a sample student record...");
            String insertSQL = "INSERT INTO students (name, age, email, course) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertSQL);

            pstmt.setString(1, "Diana Bhabi");
            pstmt.setInt(2, 28);
            pstmt.setString(3, "dianaxlotf@email.com");
            pstmt.setString(4, "Computer Science");

            int rowsInserted = pstmt.executeUpdate();
            System.out.println("✓ " + rowsInserted + " student record inserted!\n");

            // Step 4: Retrieve and display all records
            System.out.println("Step 4: Retrieving all student records...");
            String selectSQL = "SELECT * FROM students ORDER BY id";
            rs = stmt.executeQuery(selectSQL);

            System.out.println("\n" + "=".repeat(85));
            System.out.printf("%-5s | %-20s | %-5s | %-25s | %-15s%n",
                    "ID", "Name", "Age", "Email", "Course");
            System.out.println("=".repeat(85));

            int count = 0;
            while (rs.next()) {
                count++;
                System.out.printf("%-5d | %-20s | %-5d | %-25s | %-15s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("course"));
            }
            System.out.println("=".repeat(85));
            System.out.println("Total records: " + count);

            System.out.println("\n✓✓✓ ALL OPERATIONS COMPLETED SUCCESSFULLY! ✓✓✓");

        } catch (SQLException e) {
            System.err.println("\n✗✗✗ SQL ERROR OCCURRED ✗✗✗");
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Message: " + e.getMessage());

            System.err.println("\n--- TROUBLESHOOTING GUIDE ---");
            if (e.getMessage().contains("No suitable driver")) {
                System.err.println("❌ ISSUE: MySQL Connector JAR not found!");
                System.err.println("📌 SOLUTION:");
                System.err.println("   1. Download mysql-connector-j-8.x.x.jar");
                System.err.println("   2. Create 'lib' folder in project");
                System.err.println("   3. Copy JAR to 'lib' folder");
                System.err.println("   4. Right-click 'lib' → Add as Library");
            } else if (e.getMessage().contains("Access denied")) {
                System.err.println("❌ ISSUE: Wrong username or password!");
                System.err.println("📌 SOLUTION: Update the password in line 8 of the code");
            } else if (e.getMessage().contains("Unknown database")) {
                System.err.println("❌ ISSUE: Database 'firstjavacode' doesn't exist!");
                System.err.println("📌 SOLUTION: Create database in MySQL first");
            } else if (e.getMessage().contains("Communications link failure")) {
                System.err.println("❌ ISSUE: MySQL server is not running!");
                System.err.println("📌 SOLUTION: Start MySQL service or XAMPP");
            }

            System.err.println("\nFull Stack Trace:");
            e.printStackTrace();

        } finally {
            // Step 5: Close all resources
            System.out.println("\nStep 5: Closing database resources...");
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("✓ All resources closed successfully.");
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}