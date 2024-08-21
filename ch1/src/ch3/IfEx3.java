package ch3;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = new String("");
        System.out.print("점수 입력 ㄱ: ");
        int score = sc.nextInt();

        if (score >= 90) {
            if (score >= 98) {
                grade = "A+";
            } else if (score >= 94) {
                grade = "A0";
            } else {
                grade = "A-";
            }
        } else if (score >= 80) {
            if (score >= 88) {
                grade = "B+";
            } else if (score >= 94) {
                grade = "B0";
            } else {
                grade = "B-";
            }
        }
        System.out.println("니점수: " + grade);
        sc.close();
    }
}
