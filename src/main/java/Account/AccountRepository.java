package Account;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class AccountRepository {
    private static final ArrayList<AccountObject> accounts = new ArrayList<>();

    public AccountRepository() {};

    public static void addAccount(AccountObject account) {
        accounts.add(account);
    }

    public static int nextId() {
        return accounts.size() + 1;
    }

    public static AccountObject findAccountById(String id) {
        return accounts.stream()
                .filter(account -> account.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException(id));
    }

    public static void getAccounts() {
        for (AccountObject account : accounts) {
            System.out.println(account);
        }

    }
}
