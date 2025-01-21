public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + "\n" + "Account Holder: " + accountHolderName + "\n" + "Balance: " + balance);
    }    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Team A", 1000.0);
        account.displayAccountDetails();
        account.deposit(500);
        account.withdraw(200);
        account.displayAccountDetails();
    }
}
