package poly;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    Product product = new Computer();

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액부족");
            return;
        }
        money -= product.price;
        bonusPoint += product.bounsPoint;
        System.out.println(product + "을/를 구입하셨습니다.");
    }
}
