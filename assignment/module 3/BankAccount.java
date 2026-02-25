import java.util.Scanner;
class BankAccount {
    private long accountNumber;
    private double balance;
    BankAccount(long accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }}
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }}
    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }}
public class BankProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        long acc = sc.nextLong();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        BankAccount user = new BankAccount(acc, bal);
        System.out.print("Enter amount to deposit: ");
        user.deposit(sc.nextDouble());
        System.out.print("Enter amount to withdraw: ");
        user.withdraw(sc.nextDouble());
        System.out.println("Current Balance: " + user.getBalance());
        sc.close();
    }
}
