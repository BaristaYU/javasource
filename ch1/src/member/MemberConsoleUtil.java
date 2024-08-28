package member;

import java.util.Scanner;

public class MemberConsoleUtil {
    public Member addMember(Scanner sc) {

        System.out.print("id 입력 >> ");
        String id = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String name = sc.nextLine();
        System.out.print("주소 입력 >> ");
        String addr = sc.nextLine();
        System.out.print("이메일 입력 >> ");
        String email = sc.nextLine();

        Member member = new Member(id, name, addr, email);
        return member;
    }

    public void printMembers(Member[] members) {
        for (Member member : members) {
            if (member != null) {
                System.out.printf("id: %s, 이름: %s, 주소: %s, 이메일: %s\n",
                        member.getId(),
                        member.getName(),
                        member.getAddr(),
                        member.getEmail());
            }
        }
    }

    public Member updateMembers(Scanner sc, Member[] members) {
        System.out.print("수정할 id를 입력 >> ");
        String id = sc.nextLine();
        for (Member member : members) {
            if (member != null) {
                if (id.equals(member.getId())) {
                    System.out.print("수정할 주소를 입력 >> ");
                    String addr = sc.nextLine();
                    member.setAddr(addr);
                    return member;
                }
            }
        }
        System.out.println("해당되는 id가 없습니다.");
        return null;
    }

    public void removeMember(Scanner sc, Member[] members) {
        System.out.print("삭제할 id를 입력 >> ");
        String id = sc.nextLine();
        for (Member member : members) {
            if (member != null) {
                if (id.equals(member.getId())) {
                    member = null;
                    return;
                }
            }
        }
        System.out.println("해당되는 id가 없습니다.");
    }
}
