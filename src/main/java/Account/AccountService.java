package Account;

public class AccountService {
    public static void createAccount(AccountObject account) {
        AccountRepository.addAccount(account);
    }

    public static AccountObject getAccountById(String id) {
        return AccountRepository.findAccountById(id);
    }

    public static void withdraw(AccountObject account, float balance, float amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
        account.setBalance(account.getBalance() - amount);
        }
    }

    public static void deposit(AccountObject account, float amount) {
        account.setBalance(account.getBalance() + amount);
    }

}

