package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {

    private String title;
    private int userno;

    Scanner sc = new Scanner(System.in);
    // User 배열 생성
    List<User> users = new ArrayList<>();

    // 상품 배열 생성
    List<Product> products = new ArrayList<>();

    List<Product> cart = new ArrayList<>();

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // user 2명을 생성 후 users 배열에 담기
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("유용균", PayType.CASH));
    }

    @Override
    public void genProduct() {
        products.add(new CellPhone("아이폰 13", 1200000, "KT"));
        products.add(new CellPhone("갤럭시 S24", 1500000, "SKT"));
        products.add(new CellPhone("갤럭시 Z플립", 1300000, "LG"));
        products.add(new SmartTv("삼성 울트라 HD", 1800000, "4K"));
        products.add(new SmartTv("LG 스마트", 1400000, "1080p"));
        // cellphone, smartTv 섞어서 5개 생성 후 product 배열에 담기
    }

    @Override
    public void start() {
        // 출력
        // MyShop: 메인화면 - 계정선택
        // ===========================
        // [1] 홍길동(CARD)
        // [2] 성춘향(CASH)
        // [X] 종료
        // 선택 >>
        System.out.println(this.title + " : 메인화면 - 계정선택");
        System.out.println("========================================");
        // for (int i = 0; i < users.size(); i++) {
        // System.out.println("[" + (i + 1) + "] " + users.get(i) + "(" +
        // users[i].getPayType() + ")");
        // }
        int i = 0;
        for (User user : users) {
            System.out.println("[" + (i++) + "] " + user.getName() + "(" + user.getPayType() + ")");
        }

        System.out.println("[X] 종료");
        System.out.print("선택 >> ");
        String select = sc.nextLine();
        // 사용자 입력 : 1,2,x : 사용자 입력이 1,2인 경우 productList() 호출
        // x: System.exit(0)

        switch (select) {
            case "1":
            case "2":
                userno = Integer.parseInt(select);
                productList();
                break;
            case "x":
            case "X":
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 입력을 감지했습니다.");
                System.exit(0);
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop: 상품목록 - 상품선택
        // ===========================
        // 0~4 cart에 담기
        // [h] 메인화면
        // [C] 체크아웃

        System.out.println(this.title + " : 상품목록 - 상품선택");
        System.out.println("========================================");

        // for (int i = 0; i < products.length; i++) {
        // System.out.printf("[%d] ", (i + 1));
        // products[i].printDetail();
        // }

        int i = 0;
        for (Product product : products) {
            i++;
            System.out.println("[" + (i) + "]");
            product.printDetail();
        }

        System.out.println("[H] 메인화면");
        System.out.println("[C] 체크아웃");
        System.out.print("선택 >> ");

        String select = sc.nextLine();

        switch (select) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                // for (int j = 0; j < cart.size(); j++) {
                // if (cart[j] == null) {
                // cart[j] = products[Integer.parseInt(select) - 1];
                // break;
                // }
                // }
                // for (Product car : cart) {
                // if (car == null) {
                // cart.add(products.get(Integer.parseInt(select) - 1));
                // break;
                // }
                // }
                // for (int j = 0; j < cart.size(); j++) {
                // if (cart.get(j) == null) {
                // cart.add(j, products.get(Integer.parseInt(select) - 1));
                // break;
                // }
                // }
                cart.add(products.get(Integer.parseInt(select) - 1));
                productList();
                break;
            case "H":
            case "h":
                start();
                break;
            case "C":
            case "c":
                checkOut();
                break;
            default:
                System.out.println("잘못된 입력을 감지했습니다.");
                System.exit(0);
                break;
        }
    }

    public void checkOut() {
        System.out.println(this.title + " " + users.get(userno).getName() + " : 장바구니");
        System.out.println("========================================");
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i) != null) {
                System.out.printf("[%d] %s (%d)\n", (i + 1), cart.get(i).getpName(), cart.get(i).getPrice());
            }
        }

        System.out.println("결제방법 : " + users.get(userno).getPayType());
        int tot = 0;

        for (Product product : cart) {
            if (product != null) {
                tot += product.getPrice();
            }
        }

        System.out.println("합계 : " + tot);
        System.out.println("[P] 이전");
        System.out.println("[Q] 결제완료");
        String select = sc.nextLine();
        switch (select) {
            case "p":
            case "P":
                productList();
                break;
            case "q":
            case "Q":
                System.out.println("결제가 완료되었습니다.");
                System.exit(0);
                break;
            default:
                System.exit(0);
                break;
        }
    }

    // 결제방법 : card or cash
    // 합계 : 카트에 담긴 물건
    // [p] 이전 : 메뉴목록
    // [q] 결제완료 : 종료
    // 입력
}
