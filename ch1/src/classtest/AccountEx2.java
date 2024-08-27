package classtest;

import java.util.Scanner;

public class AccountEx2 {

    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("========================================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("========================================================");
            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못누름");
                    break;
            }
        }
    }

    static void createAccount() {
        System.out.print("계좌번호 >> ");
        String no = sc.nextLine();
        System.out.print("이름 >> ");
        String own = sc.nextLine();
        System.out.print("금액 >> ");
        int bal = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(no, own, bal);
                System.out.println("잘만들엇어요");
                break;
            }
        }
    }

    static void accountList() {
        for (Account account : accounts) {
            if (account != null) {
                System.out.print("계좌번호: " + account.getAccountNo() +
                        " 이름: " + account.getOwner() +
                        " 잔액: " + account.getBalance());
                System.out.println("");
            }
        }
    }

    static void deposit() {
        System.out.print("계좌번호 >> ");
        String no = sc.nextLine();
        System.out.print("금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        Account account = findAccount(no);
        if (account != null) {
            account.deposit(amount);
        }
    }

    static void withdraw() {
        System.out.print("계좌번호 >> ");
        String no = sc.nextLine();
        System.out.print("금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        Account account = findAccount(no);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    static Account findAccount(String no) {
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (no.equals(account.getAccountNo())) {
                    return account;
                }
            }
        }
        return null;
    }
}