package extendstest;

public class Account {
    private String accountNo;
    private String owner;
    private long balance;

    public Account(String accountNo, String owner, long balance) {
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

}
