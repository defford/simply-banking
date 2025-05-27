package Account;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class AccountRepository {
    private static final ArrayList<AccountObject> accounts = new ArrayList<>();

    public AccountRepository() {};

    public static int nextId() {
        return accounts.size() + 1;
    }

    public static void addAccount(AccountObject account) {
        accounts.add(account);
    }

    public static AccountObject findAccountByName(String name) {
        return accounts.stream()
                .filter(account -> account.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException(name));
    }

    public static void getAccounts() {
        for (AccountObject account : accounts) {
            System.out.println(account);
        }

    }
}
