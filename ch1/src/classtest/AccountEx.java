package classtest;

public class AccountEx {
    public static void main(String[] args) {

        Account acc = new Account("101-11-12345", "홍길동", 10000000);

        acc.deposit(50000);
        System.out.println(acc.withdraw(25000));

        Account.deposit(100000, 50000);
        System.out.println(Account.withdraw(100000, 50000));

        printAccount(acc);
    }

    static void printAccount(Account acc) {

    }
}
