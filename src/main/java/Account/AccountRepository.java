package Account;

import java.util.ArrayList;
import Exceptions.AccountNotFoundException;

public class AccountRepository {
    private static final ArrayList<AccountObject> accounts = new ArrayList<>();

    public AccountRepository() {};

    public static int nextId() {
        return accounts.size() + 1;
    }

    public static void addAccount(AccountObject account) {
        accounts.add(account);
    }

    public static AccountObject findAccountByName(String name) throws AccountNotFoundException {
        return accounts.stream()
                .filter(account -> account.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new AccountNotFoundException("Could not find account with name: " + name));
    }

    public static void getAccounts() {
        for (AccountObject account : accounts) {
            System.out.println(account);
        }

    }
}
