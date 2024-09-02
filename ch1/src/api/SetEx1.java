package api;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("사과");
        set.add("복숭아");
        set.add("포도");

        System.out.println(set);

        System.out.println("딸기 포함 여부 " + set.contains("딸기"));
        System.out.println("복숭아 삭제 " + set.remove("복숭아"));
        System.out.println("크기 " + set.size());
    }
}
