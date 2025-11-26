// src/DynamicArray.java
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Size must be non-negative.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter the values of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Values of the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Value " + (i + 1) + ": " + numbers[i]);
        }

        scanner.close();
    }
}