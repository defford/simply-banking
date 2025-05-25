package Account;

public class AccountService {
    public void createAccount(AccountObject account, float balance) {
        AccountRepository.addAccount(account);
    }

    public void withdraw(AccountObject account, float balance, float amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
        account.setBalance(account.getBalance() - amount);
        }
    }

    public void deposit(AccountObject account, float amount) {
        account.setBalance(account.getBalance() + amount);
    }
}

