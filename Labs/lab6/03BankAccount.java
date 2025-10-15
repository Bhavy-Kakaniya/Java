import java.util.Scanner;

class Bank {
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;

    Bank(int accountNo, String userName, String email, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter User Name: ");
        userName = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter Account Type (Savings/Current): ");
        accountType = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        accountBalance = sc.nextInt();
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}

public class _03BankAccount {
    public static void main(String[] args) {
        Bank b1 = new Bank(123, "bhavy", "bhavy2kakaniya@gmail.com", "Savings", 10000);
        b1.displayAccountDetails();

        System.out.println("\nEnter new account details:");
        b1.getAccountDetails();

        b1.displayAccountDetails();
    }
}
