package modifier;

import static java.lang.Math.*;

public class TimeEx {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time();
        System.out.println(time1 == time2); // false

        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon1 == singleTon2); // True

        System.out.println(Math.random());
        System.out.println(Math.PI);

        // static import 하면 함수처럼 쓸수잇음
        System.out.println(PI);
        System.out.println(random());
        System.out.println(round(1.5));

        Card card = new Card("Heart", 10);

        System.out.println(card.NUMBER);
    }
}
