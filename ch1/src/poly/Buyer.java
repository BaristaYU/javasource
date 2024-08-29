package poly;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    Product[] products = new Product[10];
    int i = 0;

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액부족");
            return;
        }
        money -= product.price;
        bonusPoint += product.bounsPoint;
        products[i++] = product;
        System.out.println(product + "을/를 구입하셨습니다.");
    }

    void summary() {
        int total = 0;
        String itemList = "";
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                total += products[i].price;
                itemList += products[i] + ", ";
            }
        }
        System.out.println("구입하신 물건은 " + itemList + " 이고, 총 가격은 " + total + "입니다.");
    }
}
