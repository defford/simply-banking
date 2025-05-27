import Account.AccountObject;
import Account.AccountService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean mainMenu = true;
        System.out.println("Welcome to Simply Banking!");

        while (mainMenu) {
            System.out.println("Please choose from the following options:");
            System.out.println("1. Create an account");
            System.out.println("2. Sign in to an account");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name for the account: ");
                    String name = scanner.nextLine();
                    int pin = 0;
                    boolean matchingPin = false;
                    while (!matchingPin) {
                        System.out.println("Set your pin: ");
                        pin = scanner.nextInt();
                        System.out.println("Confirm your pin: ");
                        int confirmPin = scanner.nextInt();
                        if (pin == confirmPin) {
                            matchingPin = true;
                        } else {
                            System.out.println("Pins do not match. Please try again.");
                        }
                    }
                    System.out.println("Enter initial deposit: ");
                    float initialDepositAmount = scanner.nextFloat();
                    scanner.nextLine();

                    AccountObject account = new AccountObject(name, pin, initialDepositAmount);
                    AccountService.deposit(account, initialDepositAmount);
                    AccountService.createAccount(account);
                    System.out.println("Account created successfully!");

                    System.out.println("Would you like to return to the main menu? (y/n)");
                    String response = scanner.nextLine();
                    if (response.equals("y")) {
                        break;
                    }
                    System.out.println("Thank you for using Simply Banking! Goodbye!");
                    mainMenu = false;
                    break;
                case 2:
                    boolean successfulLogin = false;
                    while (!successfulLogin) {
                        System.out.println("Enter account name: ");
                        name = scanner.nextLine();
                        account = AccountService.getAccountByName(name);
                        System.out.println("Enter your pin: ");
                        pin = scanner.nextInt();
                        if (account.getName().equals(name) && account.getPin() == pin) {
                            System.out.println("Welcome " + name + "!");
                            successfulLogin = true;
                        } else {
                            System.out.println("Invalid name or pin!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter account name: ");
                    name = scanner.nextLine();
                    account = AccountService.getAccountByName(name);
                    System.out.println("Enter amount to deposit: ");
                    float amount = scanner.nextFloat();
                    AccountService.deposit(account, amount);
                    System.out.println("Deposit successful!");
                    break;
                case 4:
                    System.out.println("Enter account name: ");
                    name = scanner.nextLine();
                    account = AccountService.getAccountByName(name);
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
}
