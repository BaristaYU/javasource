package classtest;

public class CardEx {
    public static void main(String[] args) {
        System.out.println("카드 width : " + Card.width);
        System.out.println("카드 height : " + Card.height);

        // 인스턴스(멤버변수) 생성
        Card card1 = new Card("Heart", 7);
        System.out.println("card1 kind : " + card1.getKind() + "card1 number : " + card1.getNumber());

        Card card2 = new Card("Spade", 4);
        System.out.println("card1 kind : " + card2.getKind() + "card1 number : " + card2.getNumber());

        // 안되는건 아닌데 쓰지 않는게 좋음. static과 private의 차이
        card1.width = 100;

        Card.width = 150;
        Card.height = 300;
        System.out.println("카드 width : " + Card.width);
        System.out.println("카드 height : " + Card.height);

        firstMethod();
        CardEx obj = new CardEx();
        obj.secondMethod();
    }

    static void firstMethod() {

    }

    void secondMethod() {

    }
}
