public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Creatong our Constructor to hold accountNumber, accountHolderName and initialBalance
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }		//Using the 'this' keyword to specify what were talking about

    ////////////////////////Deposit Method//////////////////////////////////
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    ////////////////////////Withdrawwq Method//////////////////////////////////
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Overloaded Withdraw Method with fee
    public void withdraw(double amount, double fee) {
        double totalAmount = amount + fee;
        if (totalAmount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrawn: $" + amount + " (Fee: $" + fee + ")");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Transfer funds to another account
    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " to account: " + targetAccount.accountNumber);
        } else {
            System.out.println("Transfer failed. Insufficient funds or invalid amount.");
        }
    }

    // Apply interest
    public void applyInterest(double rate) {
        if (rate > 0) {
            double interest = balance * (rate / 100);
            balance += interest;
            System.out.println("Interest applied: $" + interest);
        } else {
            System.out.println("Invalid interest rate.");
        }
    }
}
