import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the first account
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount account1 = new BankAccount(accNum, name, balance);

        // Optionally, create another account for testing transfer
        BankAccount account2 = new BankAccount("999999", "Dummy Target", 300.0);

        int choice;
        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Withdraw with Fee");
            System.out.println("5. Transfer Funds (to dummy account)");
            System.out.println("6. Apply Interest");
            System.out.println("7. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account1.displayAccountDetails();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    account1.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    account1.withdraw(withdraw);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Enter transaction fee: ");
                    double fee = scanner.nextDouble();
                    account1.withdraw(amount, fee);
                    break;
                case 5:
                    System.out.print("Enter amount to transfer: ");
                    double transfer = scanner.nextDouble();
                    account1.transferFunds(account2, transfer);
                    break;
                case 6:
                    System.out.print("Enter interest rate (%): ");
                    double rate = scanner.nextDouble();
                    account1.applyInterest(rate);
                    break;
                case 7:
                    System.out.println("Current balance: $" + account1.getBalance());
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scanner.close();
    }
}
