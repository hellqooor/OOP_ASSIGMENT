import java.util.ArrayList;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Bank> accountList = new ArrayList<>();

        accountList.add(new Bank("Pikachu", 111000));
        accountList.add(new Bank("Charmander", 560000));
        accountList.add(new Bank("Bulbasaur", 670000));
        accountList.add(new Bank("Squirtle", 890000));
        accountList.add(new Bank("Totodile", 75000));
        accountList.add(new Bank("Rowlet", 350000));
        accountList.add(new Bank("Poplio", 759000));
        accountList.add(new Bank("Litten", 980000));

        System.out.println("      Welcome to Bank ABC");

        System.out.print("Enter your username: ");
        String enteredUser = scanner.nextLine();

        Bank currentAccount = null;
        
        for (int i = 0; i < accountList.size(); i++) {
        Bank acc = accountList.get(i); 

        if (acc.getUsername().equalsIgnoreCase(enteredUser)) {
            currentAccount = acc; 
            break;                
            }
        }

        if (currentAccount == null) {
            System.out.println("Account not found. Exiting program...");
            return;
        }

        boolean process = true;
        while (process) {
            System.out.println("\n=== MENU BANK (" + currentAccount.getUsername() + ") ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Cancel/Exit");
            System.out.print("Choose Menu (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Current Balance : " + currentAccount.getBalance());
                    System.out.println("Total Transactions : " + currentAccount.getTotalTransaction());
                }
                case 2 -> {
                    currentAccount.deposit();
                    System.out.println("Total transaction : " + currentAccount.getTotalTransaction());
                }
                case 3 -> {
                    currentAccount.withdraw();
                    System.out.println("Total transaction : " + currentAccount.getTotalTransaction());
                }
                case 4 -> {
                    process = false;
                    System.out.println("Thank you for using Bank ABC!");
                }
                default -> System.out.println("Wrong input!");
            }
        }
    }
}