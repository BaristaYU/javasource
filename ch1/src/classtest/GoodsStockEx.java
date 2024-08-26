package classtest;

public class GoodsStockEx {
    public static void main(String[] args) {
        // p1015(운동화)
        GoodsStock goods1 = new GoodsStock("p1015", 100);

        // p2001(양말)
        GoodsStock goods2 = new GoodsStock("p2001", 15);

        System.out.println("현재 운동화 재고 : " + goods1.subStock(5));

        goods2.addStock(20);
        System.out.println("현재 양말 재고 : " + goods2.getStockNum());
    }
}
