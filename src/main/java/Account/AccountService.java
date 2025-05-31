package Account;

import Exceptions.AccountNotFoundException;
import Exceptions.InsufficientBalanceException;

public class AccountService {
    public static void createAccount(AccountObject account) {
        int Id = AccountRepository.nextId();
        account.setId(String.valueOf(Id));
        AccountRepository.addAccount(account);
    }

    public static AccountObject getAccountByName(String name) throws AccountNotFoundException {
        return AccountRepository.findAccountByName(name);
    }

    public static void displayAccounts() {
        AccountRepository.getAccounts();
    }

    public static void withdraw(AccountObject account, float balance, float amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient funds");
        } else {
        account.setBalance(account.getBalance() - amount);
        }
    }

    public static void deposit(AccountObject account, float amount) {
        account.setBalance(account.getBalance() + amount);
    }


}

