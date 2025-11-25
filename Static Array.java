import java.util.Scanner;
public class Arrays {
    public static void main() {
        Scanner value=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.print("Enter the values of array: ");
        for(int i=0;i<5;i++){
            arr[i]=value.nextInt();
        }

        System.out.print("The values of Array is: ");
        for (int i=0;i<5;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
