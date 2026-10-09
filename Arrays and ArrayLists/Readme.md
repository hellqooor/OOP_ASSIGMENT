## ℹ️ Information About My Code

The application models a digital bank system where user accounts are stored and managed dynamically. Instead of using fixed-size arrays, the application utilizes an `ArrayList` to store objects of the `Bank` class. This allows the system to support a flexible number of user accounts, where each account maintains its own unique state (such as `username`, `balance`, and `totalTransaction`).

1. **`Bank.java`**: Serves as the blueprint/model for an individual account, encapsulating attributes such as `username`, `balance`, and `totalTransaction`, alongside methods for banking operations (`deposit`, `withdraw`, `getBalance`).
2. **`BankDemo.java`**: Acts as the main application loop, handling user authentication and menu interactions using `ArrayList`.

---

## 💡 Implementation of ArrayList

### Explanation

In this application, `ArrayList<Bank>` functions as an in-memory collection of bank accounts:
- **Dynamic Capacity**: Accounts can be added at runtime using `.add()` without declaring a fixed array size in advance.
- **Data Encapsulation & Isolation**: Each item in the `ArrayList` is a distinct `Bank` instance. Modifying the balance or transaction counter of one account inside the list does not affect the data of other accounts.
- **Searching and Retrieval**: The system iterates through the list using `.size()` and retrieves accounts via `.get(index)` to authenticate the user's login based on their username.

### Usage in Code

```java
import java.util.ArrayList;

// Creating a dynamic list to store Bank account objects
ArrayList<Bank> accountList = new ArrayList<>();

// Adding new accounts dynamically
accountList.add(new Bank("alice", 100000));
accountList.add(new Bank("bob", 250000));
accountList.add(new Bank("Pikachu", 111000));
accountList.add(new Bank("Charmander", 560000));
accountList.add(new Bank("Bulbasaur", 670000));
accountList.add(new Bank("Squirtle", 890000));
accountList.add(new Bank("Totodile", 75000));
accountList.add(new Bank("Rowlet", 350000));
accountList.add(new Bank("Poplio", 759000));
accountList.add(new Bank("Litten", 980000));

// Searching through the ArrayList using a loop
for (int i = 0; i < accountList.size(); i++) {
    Bank acc = accountList.get(i);
    if (acc.getUsername().equalsIgnoreCase(enteredUser)) {
        currentAccount = acc; 
        break;
    }
}
```

### Example Output

```text
      Welcome to Bank ABC
Enter your username: alice

=== MENU BANK (alice) ===
1. Check Balance
2. Deposit
3. Withdraw
4. Cancel/Exit
Choose Menu (1-4): 1
Current Balance : 100000
Total Transactions : 0

=== MENU BANK (alice) ===
1. Check Balance
2. Deposit
3. Withdraw
4. Cancel/Exit
Choose Menu (1-4): 2
Please enter the amount you want to deposit : 50000
Deposit successful!

=== MENU BANK (alice) ===
1. Check Balance
2. Deposit
3. Withdraw
4. Cancel/Exit
Choose Menu (1-4): 1
Current Balance : 150000
Total Transactions : 1

=== MENU BANK (alice) ===
1. Check Balance
2. Deposit
3. Withdraw
4. Cancel/Exit
Choose Menu (1-4): 4
Thank you for using Bank ABC!
```