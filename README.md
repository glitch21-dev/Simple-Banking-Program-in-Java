💰My Simple Banking Program in Java
Made as a simple class demonstration of how methods work in Java. Hope someone might find this helpful

A basic command-line banking application written in Java. This project simulates a simple bank account system with core functionalities such as depositing, withdrawing, transferring funds between accounts, and applying interest.

🚀 Features

- ✅ Create bank accounts
- 💸 Deposit money into an account
- 🧾 Withdraw money from an account (with balance checks)
- 🔁 Transfer funds between two accounts
- 📈 Apply interest to account balance

📂 Project Structure

BankAcount/
├── src/
│ ├── Main.java # Entry point of the program
│ └── BankAccount.java # Bank account logic (deposit, withdraw, transfer, etc.)
├── bin/ # Compiled class files
├── .classpath # Eclipse project config
├── .project # Eclipse project config
└── .settings/ # Eclipse-specific settings


🧠 How It Works

Each `BankAccount` object holds:
- Account balance
- Interest rate (default or user-defined)
- Methods for:
  - `deposit(amount)`
  - `withdraw(amount)`
  - `transfer(toAccount, amount)`
  - `applyInterest()`

All operations are printed to the console for user feedback.

 🛠️ How to Run

1. Clone the repository

   ```bash
   git clone https://github.com/glitch21-dev/Simple-Banking-Program-in-Java.git
   cd Simple-Banking-Program-in-Java
