import Account.AccountObject;
import Account.AccountRepository;
import Account.AccountService;
import Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Simply Banking!");
        System.out.println("Please choose from the following options:");
        System.out.println("1. Create an account");
        System.out.println("2. Access an account");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner();
        System.in.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter name for the account: ");
                String owner = scanner.nextLine();

                AccountObject account = new AccountObject();
                AccountRepository.addAccount(account);
                System.out.println("Account created successfully!");
                break;
            case 2:
                System.out.println("Enter account ID: ");
                id = scanner.nextLine();
                account = AccountRepository.getAccount(id);
                System.out.println(account);
                break;
            case 3:
                System.out.println("Enter account ID: ");
                id = scanner.nextLine();
                account = accountRepository.getAccount(id);
                System.out.println("Enter amount to deposit: ");
                float amount = scanner.nextFloat();
                AccountService.deposit(account, amount);
                System.out.println("Deposit successful!");
                break;
            case 4:
                System.out.println("Enter account ID: ");
                String id = scanner.nextLine();
                account = accountRepository.getAccount(id);
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
