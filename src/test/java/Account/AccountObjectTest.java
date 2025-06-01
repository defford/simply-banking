package Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountObjectTest {
    AccountObject account;

    @BeforeEach
    public void setUp() {
        account = new AccountObject("John Doe", 1234, 1000.0f);
    }
    @Test
    public void testAccountGetters() {
        assertNotEquals("0", account.getId());
        assertEquals("John Doe", account.getName());
        assertEquals(1000.0f, account.getBalance());
        assertEquals(1234, account.getPin());
    }

    @Test
    public void testAccountSetters() {
        account.setId("123");
        account.setName("Jane Doe");
        account.setBalance(2000.0f);
        account.setPin(5678);
        assertEquals("123", account.getId());
        assertEquals("Jane Doe", account.getName());
        assertEquals(2000.0f, account.getBalance());
        assertEquals(5678, account.getPin());
    }

}
