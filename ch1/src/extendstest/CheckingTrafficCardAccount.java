package extendstest;

public class CheckingTrafficCardAccount extends CheckingAccount {

    // true일때 탑재
    private boolean hasTrafficCard;

    // 생성자 오버로딩
    public CheckingTrafficCardAccount(String accountNo, String owner, long balance, String cardNo) {
        super(accountNo, owner, balance, cardNo);
    }

    public CheckingTrafficCardAccount(String accountNo, String owner, long balance, String cardNo,
            boolean hasTrafficCard) {
        super(accountNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    public void setHasTrafficCard(boolean hasTrafficCard) {
        this.hasTrafficCard = hasTrafficCard;
    }

    long payTrafficCard(String cardNo, int amount) {
        // if (isHasTrafficCard() == true) {
        // if (cardNo.equals(getCardNo())) {
        // if (getBalance() < amount) {
        // System.out.println("잔액이 부족합니다.");
        // }
        // } else {
        // System.out.println("카드번호가 일치하지 않습니다.");
        // }
        // } else {
        // System.out.println("카드가 없습니다.");
        // }
        // setBalance(getBalance() - amount);
        // return getBalance();
        if (!hasTrafficCard) {
            return -1;
        }
        return pay(cardNo, amount);
    }

}