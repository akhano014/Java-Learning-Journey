import java.util.Scanner;
class Profile{
    private String Rollno;
    private String Name;
    private Double CGPA;
    private int Mathmarks;
    private int DSAmarks;

    Scanner values=new Scanner(System.in);
    Profile(String roll,String na,Double cgpa,int math,int dsa){
        this.Name=na;
        this.Rollno=roll;
        this.CGPA=cgpa;
        this.Mathmarks=math;
        this.DSAmarks=dsa;
    }

    Profile(){
        this(" ","Unknown",0.0,0,0);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    // Getter and Setter for rollNo
    public String getRollNo() {
        return Rollno;
    }

    public void setRollNo(String rollNo) {
        this.Rollno = rollNo;
    }

    public Double getcgpa(){
        return CGPA;
    }

    public void setcgpa(Double cgpa) {
        this.CGPA = cgpa;
    }

    public int getMathmarks(){
        return Mathmarks;
    }

    public void setMath(int math) {
        this.Mathmarks = math;
    }

    public int getDSAmarks(){
        return DSAmarks;
    }

    public void setDSAmarks(int dsa) {
        this.DSAmarks = dsa;
    }
    public void getvalues(){
        System.out.println("\t\t**Student Profile**");
        System.out.println("Name: "+ getName());
        System.out.println("Roll Number: "+ getRollNo());
        System.out.println("CGPA: "+ getcgpa());
        System.out.println("Math Marks: "+ getMathmarks());
        System.out.println("DSA Marks"+ getDSAmarks());
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Profile p1=new Profile();
        p1.setName("Lotf G");
        p1.setRollNo("09-131242-014");
        p1.setcgpa(3.88);
        p1.setMath(50);
        p1.setDSAmarks(66);

        p1.getvalues();
    }
}
