package practise;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Card cards[][] = new Card[4][13];
        String kinds[] = { "Spade", "Diamond", "Heart", "Clover" };
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 14; i++) {
                cards[j][i] = new Card(kinds[j], i + 1);
            }
        }

        System.out.println("인생한방! 블랙잭입니다.");
        int firstCard = (int) Math.random() * 10;
        System.out.println(firstCard);
    }

}
