package extendstest;

//은행 계좌 + 직불카드
public class CheckingAccount extends Account {
    private String cardNo;

    public CheckingAccount(String accountNo, String owner, long balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;
    }

    long pay(String cardNo, int payment) {
        if (cardNo.equals(this.cardNo)) {
            withdraw(payment);
        } else {
            System.out.println("카드번호 다름");
        }
        return getBalance();
    }
}
