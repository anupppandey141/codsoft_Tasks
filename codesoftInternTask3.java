import java.util.*;

public class codesoftInternTask3 {
    private Scanner scanner = new Scanner(System.in);
    private double balance = 1000.00; // Starting balance

    public static void main(String[] args) {
        codesoftInternTask3 atm = new codesoftInternTask3();
        atm.run();
    }

    public void run() {
        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    exit();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Your balance: $" + balance);
    }

    private void withdraw() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is $" + balance);
        }
    }

    private void deposit() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is $" + balance);
        }
    }

    private void exit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
}
