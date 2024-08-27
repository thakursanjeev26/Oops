package Level1Programs;

public class BankAccount {
    double balance;
    int accountNumber;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

    }

    public void deposit(double amount) {
        balance += amount;
        if (amount > 0) {
            System.out.println("deposited " + amount);
            System.out.println("Current Balance is" + balance);
        }
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("withdraw Ammount" + amount);
        System.out.println("current balance:" + balance);
    }

    void display() {
        System.out.println("Ac" + accountNumber);
        System.out.println("balance" + balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(123,25000);
        ba.display();
        ba.withdraw(500);
        ba.deposit(1000);
    }
}
