package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위 1 바위 2 보 3, 컴퓨가 랜덤으로
        int com = (int) (Math.random() * 3) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3)!: ");
        int user = sc.nextInt();

        // switch (user) {
        // case 1: // 유저 가위
        // switch (com) {
        // case 1: // 컴 가위
        // System.out.println("컴퓨터 가위, 비김");
        // break;
        // case 2: // 컴 바위
        // System.out.println("컴퓨터 바위, 짐");
        // break;
        // default: // 컴 보
        // System.out.println("컴퓨터 보, 이김");
        // break;
        // }
        // break;

        // case 2: // 유저 바위
        // switch (com) {
        // case 1: // 컴 가위
        // System.out.println("컴퓨터 가위, 이김");
        // break;
        // case 2: // 컴 바위
        // System.out.println("컴퓨터 바위, 비김");
        // break;
        // default: // 컴 보
        // System.out.println("컴퓨터 보, 짐");
        // break;
        // }
        // break;

        // case 3: // 유저 보
        // switch (com) {
        // case 1: // 컴 가위
        // System.out.println("컴퓨터 가위, 짐");
        // break;
        // case 2: // 컴 바위
        // System.out.println("컴퓨터 바위, 이김");
        // break;
        // default: // 컴 보
        // System.out.println("컴퓨터 보, 비김");
        // break;
        // }
        // break;

        // }
        // 가위1 바위2 보3
        switch (user - com) {
            case 1:
            case -2:
                System.out.println("이김");
                break;
            case 2:
            case -1:
                System.out.println("짐");
                break;
            default:
                System.out.println("비김");
                break;
        }

        sc.close();
    }
}
