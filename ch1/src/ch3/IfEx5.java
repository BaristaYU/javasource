package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇시간 일했나요: ");
        int wHour = sc.nextInt();

        if (wHour <= 8) {
            System.out.println("퉤: " + (10000 * wHour));
        } else {
            int more_wHour = wHour - 8;
            int total = (10000 * 8) + (15000 * more_wHour);
            System.out.println("노예녀석: " + total);
        }
        sc.close();
    }
}
