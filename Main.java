package bank;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        System.out.println("Initial balance: " + account.getBalance() + " units");

        account.deposit(500);
        System.out.println("Current balance: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Current balance: " + account.getBalance());
    }
}
