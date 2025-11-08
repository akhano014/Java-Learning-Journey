import java.util.Scanner;

public class Practicecode {

    static Scanner value = new Scanner(System.in);
    static String user_name;
    static String user_phone;
    static String Register_email;
    static String Register_password;
    static int Total_balance;

    public static void main(String[] args) {

        System.out.println("\n\t****Create Account****");
        createAccount();

        System.out.println("\n\t****Login****");
        login();

        System.out.print("Enter your initial Amount: ");
        Total_balance = value.nextInt();
        value.nextLine();

        int choice;
        do {
            System.out.println("\n----ATM Menu----");
            System.out.println("1. Check Account Details");
            System.out.println("2. Check Account Balance");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = value.nextInt();
            value.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("\n---Account Details---");
                    System.out.println("Name: " + user_name);
                    System.out.println("Phone: " + user_phone);
                    System.out.println("Email: " + Register_email);
                    break;
                }
                case 2: {
                    System.out.println("Your Account Balance is: " + Total_balance);
                    break;
                }
                case 3: {
                    depositAmount();
                    break;
                }
                case 4: {
                    withdrawAmount();
                    break;
                }
                case 5: {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Try again.");
                    break;
                }
            }

        } while (choice != 5);
    }

    static void createAccount() {

        System.out.print("Enter Your Name: ");
        user_name = value.nextLine();

        while (true) {
            System.out.print("Enter Your Phone Number: ");
            user_phone = value.nextLine();
            if (user_phone.length() == 11 && user_phone.matches("[0-9]+")) {
                break;
            } else {
                System.out.println("Invalid phone number. Must be exactly 11 digits.");
            }
        }

        while (true) {
            System.out.print("Enter Your Email: ");
            Register_email = value.nextLine();
            if (Register_email.contains("@") && Register_email.contains(".com")
                    && Register_email.indexOf("@") < Register_email.lastIndexOf(".com")) {
                break;
            } else {
                System.out.println("Invalid email. Must contain '@' and '.com', and '@' must come before '.com'.");
            }
        }

        while (true) {
            System.out.print("Enter Your Password (8-16 characters): ");
            Register_password = value.nextLine();
            if (Register_password.length() >= 8 && Register_password.length() <= 16) {
                break;
            } else {
                System.out.println("Invalid password. Must be 8-16 characters.");
            }
        }

        System.out.println("\nAccount created successfully!");
        System.out.println("Name: " + user_name);
        System.out.println("Phone: " + user_phone);
        System.out.println("Email: " + Register_email);
    }

    static void login() {
        while (true) {
            System.out.print("Enter your Email: ");
            String email = value.nextLine();

            System.out.print("Enter your Password: ");
            String password = value.nextLine();

            if (email.equals(Register_email) && password.equals(Register_password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Email or Password incorrect. Try again.");
            }
        }
    }

    static void depositAmount() {
        System.out.print("Enter amount to deposit: ");
        int deposit = value.nextInt();
        value.nextLine();
        Total_balance += deposit;
        System.out.println("Amount deposited successfully. Current Balance: " + Total_balance);
    }

    static void withdrawAmount() {
        System.out.print("Enter amount to withdraw: ");
        int withdraw = value.nextInt();
        value.nextLine();
        if (withdraw > Total_balance) {
            System.out.println("Insufficient balance! Current Balance: " + Total_balance);
        } else {
            Total_balance -= withdraw;
            System.out.println("Amount withdrawn successfully. Current Balance: " + Total_balance);
        }
    }
}
