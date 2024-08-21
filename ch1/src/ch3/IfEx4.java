package ch3;

import java.util.Scanner;

public class IfEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 ㄱ: ");
        int num = sc.nextInt();
        if (num % 2 == 0 && num != 0) {
            System.out.println("짝수임 ㅅㄱ");
        } else if (Math.abs(num) % 2 == 1) {
            System.out.println("홀수임 ㅅㄱ");
        } else {
            System.out.println("단디입력해라");
        }
        sc.close();
    }
}
