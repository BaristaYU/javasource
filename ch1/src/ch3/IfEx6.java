package ch3;

import java.util.Scanner;

public class IfEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇년임?: ");
        int year = sc.nextInt();
        // 년도를 400으로 나눈 나머지가 0인경우, 100 나머지 0 아니거나
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("윤년임");
        } else {
            System.out.println("윤년 아님");
        }

        sc.close();
    }
}
