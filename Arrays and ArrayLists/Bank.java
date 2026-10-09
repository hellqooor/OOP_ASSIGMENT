import java.util.Scanner;

public class Bank {
    private String username;
    private long balance;
    private int totalTransaction;

    private Scanner input = new Scanner(System.in);

    // Constructor
    public Bank(String username, long initialBalance) {
        this.username = username;
        this.balance = initialBalance;
        this.totalTransaction = 0;
    }
    // Method
    public static void cs() {
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
    }
    public void deposit() {
        cs();
        System.out.print("Please enter the amount you want to deposit : ");
        double money = input.nextDouble();
        cs();
        this.balance += money;
        this.totalTransaction++;
        System.out.println("Deposit successful!");
    }
    public void withdraw() {
        cs();
        System.out.print("Please enter the amount you want to withdraw : ");
        double money = input.nextDouble();
        if (money > this.balance) {
            System.out.println("Your balance is not enough to make a withdrawal. Please try again.");
        } else {
            this.balance -= money;
            this.totalTransaction++;
            System.out.println("Withdrawal successful!");
        }
    }
    // Getter
    public String getUsername() {
        return this.username;
    }

    public long getBalance() {
        return this.balance;
    }

    public int getTotalTransaction() {
        return this.totalTransaction;
    }
}