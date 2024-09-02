package exception;

public class AccountEx {
    public static void main(String[] args) {
        Account chk = new Account("111", "유용균", 1000000);

        chk.withdraw(2000000);

    }
}
