package member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        boolean flag = true;
        // int count = -1;
        Scanner sc = new Scanner(System.in);

        Member[] members = new Member[5];
        Member member = new Member();

        MemberConsoleUtil util = new MemberConsoleUtil();

        while (flag) {
            System.out.println("===================== 회원관리 프로그램 =====================");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원목록");
            System.out.println("3. 회원수정");
            System.out.println("4. 회원삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println();

            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // count++;
                    // members[count] = util.addMember(sc);
                    for (int i = 0; i < members.length; i++) {
                        if (members[i] == null) {
                            members[i] = util.addMember(sc);
                            break;
                        }
                    }
                    break;
                case 2:
                    util.printMembers(members);
                    break;
                case 3:
                    member = util.updateMembers(sc, members);
                    if (member != null) {
                        System.out.println(member.getId() + "님 주소가 수정되었습니다.");
                    }
                    break;
                case 4:
                    util.removeMember(sc, members);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("번호 재확인 ㄱㄱ");
                    break;
            }
        }
    }
}
