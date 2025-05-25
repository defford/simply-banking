import java.util.HashMap;
import java.util.NoSuchElementException;

public class AccountRepository {
    private final HashMap<String, AccountObject> accounts = new HashMap<>();

    public void addAccount(AccountObject account) {
        accounts.put(account.getId(), account);
    }

    public AccountObject getAccount(String id) {
        AccountObject account = accounts.get(id);
        if (account == null) {
            throw new NoSuchElementException(id);
        }
        return account;
    }

}
