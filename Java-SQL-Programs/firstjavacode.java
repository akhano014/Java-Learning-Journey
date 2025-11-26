import java.sql.*;
public class firstjavacode{
    private static Statement st;

    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjavacode","root",
                    "8787");
            Statement st= conn.createStatement();
//            String query="CREATE TABLE IF NOT EXISTS Profile ("+
//                    "student_id INT PRIMARY KEY AUTO_INCREMENT,"+
//                    "Student_name VARCHAR(50),"+
//                    "Student_Department VARCHAR(50),"+
//                    "Student_Section VARCHAR(50),"+
//                    "Student_Semester INT NOT NULL"+
//                    ")";
//            String insert_query="INSERT INTO Profile(student_id,Student_name,Student_Department,Student_Section,Student_Semester)"+
//                    "VALUES(3,'Ali Huzaifa Awan','AD & AC','AD & AC-2D',2)";
            ResultSet ss=st.executeQuery("SELECT * FROM Profile");
            while(ss.next()){
                int id=ss.getInt("student_id");
                String name=ss.getString("Student_Name");
                String dep=ss.getString("Student_Department");
                String sec=ss.getString("Student_Section");
                int sem=ss.getInt("Student_Semester");
                System.out.println("*****Students Profile****");
                System.out.println("Student ID: "+id);
                System.out.println("Student Name: "+name);
                System.out.println("Student Department: "+dep);
                System.out.println("Student Section: "+sec);
                System.out.println("Student Semester: "+sem);
            }
            conn.close();
        }
        catch (Exception ee){
            ee.printStackTrace();
        }
       

    }
}