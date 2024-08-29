package shop;

public abstract class Product {
    private String pName;
    private int price;

    public Product(String pName, int price) {
        this.pName = pName;
        this.price = price;
    }

    void printDetail() {
        System.out.println("제품명: " + pName);
        System.out.println("제품가격: " + price);
        printExtra();
    }

    abstract void printExtra();

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

}
