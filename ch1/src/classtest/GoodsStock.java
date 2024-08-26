package classtest;

public class GoodsStock {
    private String goodsCode;
    private int stockNum;

    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    void addStock(int num) {
        stockNum += num;
    }

    int subStock(int num) {
        stockNum -= num;
        return stockNum;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public int getStockNum() {
        return stockNum;
    }
}
