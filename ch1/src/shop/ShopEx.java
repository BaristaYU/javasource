package shop;

public class ShopEx {
    public static void main(String[] args) {
        MyShop shop = new MyShop();
        MyShop2 shop2 = new MyShop2();

        // 상점이름 지정
        shop2.setTitle("Myshop");

        // user 생성
        shop2.genUser();

        // 상품 생성
        shop2.genProduct();

        // 상점 시작
        shop2.start();
    }
}
