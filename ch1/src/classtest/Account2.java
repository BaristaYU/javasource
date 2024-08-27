package classtest;

public class Account2 {
    private String accountNo;
    private String owner;
    private long balance;

    public Account2(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(long depo) {
        balance += depo;
    }

    long withdraw(long with) {
        balance -= with;
        return balance;
    }

    String getAccountNo() {
        return accountNo;
    }

    String getOwner() {
        return owner;
    }

    long getBalance() {
        return balance;
    }

    static void deposit(long balance, long depo) {
        balance += depo;
    }

    static long withdraw(long balance, long with) {
        balance -= with;
        return balance;
    }

    @Override
    public String toString() {
        return "Account2 [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
