package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount chk = new CheckingAccount("111", "유용균", 1000000, "222");

        chk.deposit(100000);
        System.out.println("현재 잔액: " + chk.getBalance());

        System.out.println("사용 후 잔액: " + chk.pay("111", 1000));

        System.out.println("-----------------------------------------------");
        CreditLineAccount credit = new CreditLineAccount("333-33", "용균", 100000, 5000000);
        System.out.println("마이너스 통장 계좌 잔액 확인 : " + credit.getBalance());
        credit.withdraw(3000000);
        System.out.println("마이너스 통장 계좌 잔액 확인 : " + credit.getBalance());

        System.out.println("-----------------------------------------------");
        BonusPointAccount bonus = new BonusPointAccount("444-44", "유용균", 0);
        System.out.println("현재점수: " + bonus.getBounusPoint());

        bonus.deposit(2000000);
        System.out.println("잔고: " + bonus.getBalance());
        System.out.println("현재점수: " + bonus.getBounusPoint());

        long balance;

        System.out.println("===================================");
        CheckingTrafficCardAccount tcard = new CheckingTrafficCardAccount("666", "류용균", 100000, "555-55");
        System.out.println(tcard.isHasTrafficCard() ? "교통카드 있음" : "교통카드 없음");

        tcard.setHasTrafficCard(true);

        balance = tcard.payTrafficCard("555-55", 50000);
        if (balance == -1) {
            System.out.println("교통카드없음 " + balance);
        } else {
            System.out.println("잔액 " + balance);
        }
    }
    // 사용금액을 지불한다.
    // pay(): 사용금액, 카드번호

}
