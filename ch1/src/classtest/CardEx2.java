package classtest;

import java.util.Arrays;

public class CardEx2 {
    public static void main(String[] args) {
        Card card1 = new Card("spade", 1);

        // 배열
        int arr[] = new int[10];
        System.out.println(Arrays.toString(arr));

        // 객체배열

        // 초기화 안했을 때 null값 들어감
        Card cards[] = {
                new Card("spade", 1),
                new Card("heart", 1),
                new Card("diamond", 1),
        };

        for (Card card : cards) {
            System.out.println("kind " + card.getKind() + ", number " + card.getNumber());
        }

    }
}
