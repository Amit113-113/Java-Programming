import java.util.Scanner;

public class ATM {

    // Function to display the main menu
    public static void displayMenu() {
        System.out.println("\nWelcome to the ATM:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
    }

    // Function to simulate card processing
    public static void cardProcessing() {
        System.out.println("Please insert your CARD...");
        try {
            Thread.sleep(2000);  // Simulate card processing delay
        } catch (InterruptedException e) {
            System.out.println("Card processing interrupted.");
        }
    }

    // Function to validate the PIN
    public static boolean validatePin(int correctPin, Scanner scanner) {
        for (int i = 0; i < 3; i++) {  // Give the user 3 attempts to enter the correct pin
            System.out.print("Enter your ATM PIN: ");
            int pin = scanner.nextInt();
            if (pin == correctPin) {
                return true;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
        }
        return false;
    }

    // Function to handle balance inquiry
    public static void checkBalance(double balance) {
        System.out.println("Your current balance is: $" + balance);
    }

    // Function to handle withdrawal
    public static double withdrawFunds(double balance, Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        try {
            double withdrawAmount = scanner.nextDouble();
            if (withdrawAmount <= 0) {
                System.out.println("Please enter a valid amount.");
            } else if (withdrawAmount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= withdrawAmount;
                System.out.println("$" + withdrawAmount + " has been withdrawn. Your new balance is: $" + balance);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();  // Clear the invalid input
        }
        return balance;
    }

    // Function to handle deposits
    public static double depositFunds(double balance, Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        try {
            double depositAmount = scanner.nextDouble();
            if (depositAmount <= 0) {
                System.out.println("Please enter a valid amount.");
            } else {
                balance += depositAmount;
                System.out.println("$" + depositAmount + " has been deposited. Your new balance is: $" + balance);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();  // Clear the invalid input
        }
        return balance;
    }

    // Main function to run the ATM system
    public static void atmMachine() {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        double balance = 5000.0;

        cardProcessing();

        if (!validatePin(correctPin, scanner)) {
            System.out.println("Too many incorrect attempts. Exiting.");
            return;
        }

        while (true) {
            displayMenu();
            System.out.print("Please select an option: ");
            int option;

            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear the invalid input
                continue;
            }

            switch (option) {
                case 1:
                    checkBalance(balance);
                    break;
                case 2:
                    balance = withdrawFunds(balance, scanner);
                    break;
                case 3:
                    balance = depositFunds(balance, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select from the menu.");
            }
        }
    }

    // Start the ATM system
    public static void main(String[] args) {
        atmMachine();
    }
}
