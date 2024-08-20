package ch1;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 ㄱ:");
        int num = sc.nextInt();
        System.out.printf("num = %d\n", num);
        sc.close();
    }
}
