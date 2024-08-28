package poly;

public class Product {
    int price;
    int bounsPoint;

    public Product(int price) {
        this.price = price;
        bounsPoint = (int) (price / 10.0);
    }

}
