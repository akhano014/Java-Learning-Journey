import java.util.Scanner;
public class ConditionalStructure{
    public static void main(String[] args)
    {
        Scanner value=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=value.nextLine();
        System.out.print("Enter Your Enrollment: ");
        String enroll=value.nextLine();
        System.out.print("Enter the Marks of Math: ");
        int mark1=value.nextInt();
        System.out.print("Enter the Marks of DSA: ");
        int mark2=value.nextInt();
        System.out.print("Enter the Marks of Civics: ");
        int mark3=value.nextInt();

        int total_marks=mark1+mark2+mark3;
        double percentage=(total_marks/300.0)*100;
        char grade;
        if(total_marks>=85){
            grade='A';
        }
        else if(total_marks>=70){
            grade='B';
        }
        else if(total_marks>=60){
            grade='C';
        }
        else{
            grade='F';
        }

        System.out.print("\n1. Show Marks of Subjects: ");
        System.out.print("\n2. Show Total Marks: ");
        System.out.print("\n3. Show Percentage: ");
        System.out.print("\n4. Show Grade: ");
        System.out.print("\n5. Show Complete Result: ");
        System.out.print("\n6. Exit");
        System.out.print("Enter your choice: ");
        int choice=value.nextInt();
        do {
            switch (choice) {
                case 1: {
                    System.out.println("\nMarks of Math: " + mark1);
                    System.out.println("Marks of DSA: " + mark2);
                    System.out.println("Marks of Civics: " + mark3);
                    break;
                }
                case 2: {
                    System.out.println("Total Marks: " + total_marks);
                    break;
                }
                case 3: {
                    System.out.println("Percentage: " + percentage + "%");
                    break;
                }
                case 4: {
                    System.out.println("Grade: " + grade);
                    break;
                }
                case 5: {
                    System.out.println("\n\tY**our Result** ");
                    System.out.println("Name: " + name);
                    System.out.println("Enrollment: " + enroll);
                    System.out.println("Total Marks: " + total_marks);
                    System.out.println("Percentage: " + percentage + "%");
                    System.out.println("Grade: " + grade);
                    break;
                }
                case 6: {
                    System.out.println("Thank You");
                    break;
                }
                default: {
                    System.out.println("Invalid choice...");
                    break;
                }

            }

            System.out.print("\nEnter your choice again: ");
            choice = value.nextInt();
        }while(choice !=6);

    }

}