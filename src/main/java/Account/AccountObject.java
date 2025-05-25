package Account;

public class AccountObject {
    private String id;
    private String owner;
    private float balance;

    public AccountObject() {};

    public AccountObject(String id, String owner, float balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

}
