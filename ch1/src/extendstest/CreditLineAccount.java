package extendstest;

public class CreditLineAccount extends Account {

    private int creditLine;

    public CreditLineAccount(String accountNo, String owner, long balance, int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }

    @Override
    long withdraw(long with) {
        // 잔액 + 마이너스 한도 - 사용금액
        long payment = getBalance() + creditLine - with;
        if (payment < 0) {
            System.out.println("한도초과");
            return getBalance();
        }
        setBalance(getBalance() - with);
        return getBalance();
    }

    public int getCreditLine() {
        return creditLine;
    }
}
