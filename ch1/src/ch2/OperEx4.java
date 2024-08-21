package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("한달 월급 ㄱㄱ: ");
        int salary = sc.nextInt();
        int slavory = 10 * 12 * salary;
        System.out.println("");
        System.out.println("10년동안 금리없이 저축한돈: " + slavory);
        sc.close();
    }
}
