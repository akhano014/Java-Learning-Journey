import java.util.Scanner;
class OOP{
    String Name;
    String Department;
    int Age;
    OOP(){
        this.Name=" ";
        this.Department=" ";
        this.Age=10;
    }
    OOP(String na,String Dep,int age){
        this.Name=na;
        this.Department=Dep;
        this.Age=age;
    }

    public void entervalues(){
        Scanner values=new Scanner(System.in);

        System.out.print("Enter your name: ");
        Name=values.nextLine();
        System.out.print("Enter Your Department: ");
        Department=values.nextLine();
        System.out.print("Enter Your Age: ");
        Age=values.nextInt();
    }

    public void displayvalues(){
        System.out.println("Name: "+ Name);
        System.out.println("Department: "+ Department );
        System.out.println("Age: "+Age);
    }
}
public class BasicOOP {
    public static void main(String[] args) {
        OOP op1=new OOP();
        System.out.println("\t**Please Enter Your Profile Information**");
        op1.entervalues();

        System.out.println("\t**Profile Information**");
        op1.displayvalues();
    }
}
