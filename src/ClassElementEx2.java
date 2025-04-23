
class Account {
    private int balance;

    public Account() {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }
    public int getBalance() {
        return balance;
    }

}

public class ClassElementEx2 {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고:" + account.getBalance());
    }
}