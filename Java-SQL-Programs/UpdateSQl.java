import java.sql.*;

public class UpdateSQl {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjavacode","root",
                    "8787");
            Statement st=conn.createStatement();
            String update_query="UPDATE Profile SET Student_name='Ahtisham khan',Student_Department='BSE' WHERE student_id=2";
            int rows=st.executeUpdate(update_query);
            if(rows>0){
                System.out.println("Record Updated Successfully");
            }
            else{
                System.out.println("No record found to update.");
            }
            conn.close();
        }
        catch(Exception ee){
            ee.printStackTrace();
        }

    }
}
