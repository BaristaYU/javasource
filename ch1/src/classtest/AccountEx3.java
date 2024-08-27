package classtest;

public class AccountEx3 {
    public static void main(String[] args) {
        Account2 acc = new Account2("111", "유용균", 100000);
        System.out.println(acc);

        Account2 accounts[] = new Account2[2];
        accounts[0] = new Account2("111", "유용균", 100000);
        accounts[1] = new Account2("222", "홍길동", 200000);

        for (Account2 account22 : accounts) {
            System.out.println(account22);
        }
    }
}
