package ch3;

import java.util.Scanner;

public class SwitchEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 피연산자 2개와 연산자 1개

        System.out.print("연산자(+,-,*,/,%) 입력: ");
        String var1 = sc.nextLine();

        System.out.print("숫자1 입력: ");
        int num1 = sc.nextInt();

        System.out.print("숫자2 입력: ");
        int num2 = sc.nextInt();

        switch (var1) {
            case "+":
                int sum = num1 + num2;
                System.out.printf("%d + %d = %d", num1, num2, sum);
                break;
            case "-":
                int sub = num1 - num2;
                System.out.printf("%d - %d = %d", num1, num2, sub);
                break;
            case "*":
                int mul = num1 * num2;
                System.out.printf("%d * %d = %d", num1, num2, mul);
                break;
            case "/":
                int div = num1 / num2;
                System.out.printf("%d / %d = %d", num1, num2, div);
                break;
            case "%":
                int nam = num1 % num2;
                System.out.printf("%d % %d = %d", num1, num2, nam);
                break;
            default:
                break;
        }

        sc.close();
    }
}
