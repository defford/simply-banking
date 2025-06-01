package Account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountRepositoryTest {
    AccountObject account;

    @Test
    public void testAddAccount() {
        account = new AccountObject("John Doe", 1234, 1000.0f);
        AccountRepository.addAccount(account);
        assertEquals(1, AccountRepository.getAccounts().size());
    }
}
