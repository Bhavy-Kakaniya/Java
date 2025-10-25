import java.util.Scanner;

class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class Account {
    private int balance;
    private static final int MIN_BALANCE = 1000;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        System.out.println("Current Balance: ₹" + balance);
    }

    public void withdraw(int amount) throws InsufficientFundException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundException("Withdrawal denied! Minimum balance of ₹" + MIN_BALANCE + " must there.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        }
    }
}

public class _02bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(5000);

        while (true) {
            System.out.println("\n---- Bank Menu ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        int dep = sc.nextInt();
                        acc.deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int wit = sc.nextInt();
                        acc.withdraw(wit);
                        break;
                    case 3:
                        System.out.println("Thank you");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InsufficientFundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
