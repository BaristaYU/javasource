package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount chk = new CheckingAccount("111", "유용균", 1000000, "222");

        chk.deposit(100000);
        System.out.println("현재 잔액: " + chk.getBalance());

        System.out.println("사용 후 잔액: " + chk.pay("111", 1000));
    }
    // 사용금액을 지불한다.
    // pay(): 사용금액, 카드번호

}
