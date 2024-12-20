package bank;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " units deposited.");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " units withdrawn.");
        } else {
            System.out.println("Invalid amount!");
        }
    }
}
