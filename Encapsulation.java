import java.util.Scanner;
class Encapsulate{
    private int Rollno;
    private String Name;
    private Double CGPA;
    private int Mathmarks;
    private int DSAmarks;

    Scanner values=new Scanner(System.in);
    Encapsulate(int roll,String na,Double cgpa,int math,int dsa){
        this.Name=na;
        this.Rollno=roll;
        this.CGPA=cgpa;
        this.Mathmarks=math;
        this.DSAmarks=dsa;
    }

    Encapsulate(){
        this(0,"Unknown",0.0,0,0);
    }

    public void setvalues(){
        System.out.print("Enter your name: ");
        Name=values.nextLine();
        System.out.print("Enter your Roll Number: ");
        Rollno=values.nextInt();
        System.out.print("Enter your CGPA: ");
        CGPA=values.nextDouble();
        System.out.print("Enter Your Math Marks: ");
        Mathmarks=values.nextInt();
        System.out.print("Enter Your DSA Marks: ");
        DSAmarks=values.nextInt();
    }

    public void getvalues(){
        System.out.println("\t\t**Student Profile**");
        System.out.println("Name: "+ Name);
        System.out.println("Roll Number: "+ Rollno);
        System.out.println("CGPA: "+CGPA);
        System.out.println("Math Marks: "+Mathmarks);
        System.out.println("DSA Marks"+ DSAmarks);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulate e1=new Encapsulate();
        e1.setvalues();
        e1.getvalues();
    }
}
