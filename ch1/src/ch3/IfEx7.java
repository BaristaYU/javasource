package ch3;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1: ");
        int num1 = sc.nextInt();
        System.out.print("숫자2: ");
        int num2 = sc.nextInt();
        System.out.print("숫자3: ");
        int num3 = sc.nextInt();

        // if (num3 > num2) { // num3 > num2
        // if (num2 > num1) { // num3 > num2 > num1 // num1이 제일 작은경우
        // System.out.println(num1);
        // } else { // num3 > num2, num2 < num1 // num2가 제일 작은경우
        // System.out.println(num2);
        // }
        // } else if (num3 > num1) { // num1 < num3 < num2 // num1이 제일 작은 경우
        // System.out.println(num1);
        // } else { // num3 < num2, num3 < num1
        // System.out.println(num3);
        // }

        // int min = num1;

        // if (min > num2){
        // min = num2;
        // }

        // if (min > num3){
        // min = num3;
        // }

        int max = num1;

        if (max < num2) {
            max = num2;
        }

        if (max < num3) {
            max = num3;
        }

        System.out.println(max);

        sc.close();
    }
}
