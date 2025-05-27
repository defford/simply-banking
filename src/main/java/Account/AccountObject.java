package Account;

public class AccountObject {
    private String id;
    private String name;
    private int pin;
    private float balance;

    public AccountObject(String name, int pin, float balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public float getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

}
