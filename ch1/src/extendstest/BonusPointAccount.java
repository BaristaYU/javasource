package extendstest;

public class BonusPointAccount extends Account {

    private int bounusPoint;

    public BonusPointAccount(String accountNo, String owner, long balance) {
        super(accountNo, owner, balance);
    }

    @Override
    void deposit(long depo) {
        super.deposit(depo);
        bounusPoint += (int) (0.01 * depo);
    }

    public int getBounusPoint() {
        return bounusPoint;
    }

}
