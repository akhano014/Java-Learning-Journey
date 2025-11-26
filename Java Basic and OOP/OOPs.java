import java.util.Scanner;

class Person{
    private String Rollno;
    private String Name;
    private Double CGPA;
    private int Mathmarks;
    private int DSAmarks;

    Scanner values=new Scanner(System.in);
    Person() {
        this.Name = "";
        this.Rollno = "";
        this.CGPA = 0.0;
        this.Mathmarks = 0;
        this.DSAmarks = 0;
    }
    Person(String roll,String na,Double cgpa,int math,int dsa){
        this.Name=na;
        this.Rollno=roll;
        this.CGPA=cgpa;
        this.Mathmarks=math;
        this.DSAmarks=dsa;
    }

    public void setvalues(){
        System.out.print("Enter your Name: ");
        Name=values.nextLine();
        System.out.print("Enter your Roll Number: ");
        Name=values.nextLine();
        System.out.print("Enter your CGPA: ");
        CGPA=values.nextDouble();
        System.out.print("Enter your Math Marks: ");
        Mathmarks=values.nextInt();
        System.out.print("Enter your DSA Marks: ");
        DSAmarks=values.nextInt();
    }
    public void getvalues(){
        System.out.println("\t\t**Student Profile**");
        System.out.println("Name: "+ Name);
        System.out.println("Roll Number: "+ Rollno);
        System.out.println("CGPA: "+ CGPA);
        System.out.println("Math Marks: "+ Mathmarks);
        System.out.println("DSA Marks"+ DSAmarks);
    }
}

class Child extends Person{
    private int number;

    Child(){
        super(" "," ",0.0,0,0);
        number=0;
    }
    Child(int no,String nam,String roll,Double cg,int m,int ds){
        super(nam,roll,cg,m,ds);
        this.number=no;
    }

    void Setvalues(){
        setvalues();
        System.out.print("Enter your number: ");
        number=values.nextInt();
    }

    void display(){
        System.out.println("\t\t\t***Student Profile****");
        getvalues();
        System.out.println("Number: "+ number);
    }

}
public class OOPs {
    public static void main(String[] args) {
        Child obj1=new Child();
        obj1.Setvalues();
        obj1.display();
    }
}
