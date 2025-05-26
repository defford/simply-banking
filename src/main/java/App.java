import Account.AccountObject;
import Account.AccountService;
import Account.AccountService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Simply Banking!");
        System.out.println("Please choose from the following options:");
        System.out.println("1. Create an account");
        System.out.println("2. Access an account");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter name for the account: ");
                String owner = scanner.nextLine();

                AccountObject account = new AccountObject(owner);
                AccountService.createAccount(account);
                System.out.println("Account created successfully!");
                break;
            case 2:
                System.out.println("Enter account ID: ");
                String id = scanner.nextLine();
                account = AccountService.getAccountById(id);
                System.out.println(account);
                break;
            case 3:
                System.out.println("Enter account ID: ");
                id = scanner.nextLine();
                account = AccountService.getAccountById(id);
                System.out.println("Enter amount to deposit: ");
                float amount = scanner.nextFloat();
                AccountService.deposit(account, amount);
                System.out.println("Deposit successful!");
                break;
            case 4:
                System.out.println("Enter account ID: ");
                id = scanner.nextLine();
                account = AccountService.getAccountById(id);
                System.out.println("Enter amount to withdraw: ");
                amount = scanner.nextFloat();
                if (account.getBalance() >= amount) {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Insufficient funds!");
                }
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
