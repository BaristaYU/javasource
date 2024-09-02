package api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        // <객체>: list에 담을 타입 선언
        // 1,2,3,4 => <Integer>, <Double>
        // 10 개의 String 을 담는 크기 설정(기본값)

        List<String> list = new ArrayList<>(30);

        // add()
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");
        // add(index, 요소): index에 추가
        list.add(2, "바나나");

        System.out.println(list);

        list.get(3);
        System.out.println(list);
        list.remove("복숭아");
        System.out.println(list);

        System.out.println(list.contains("포도"));

        list.sort(Comparator.reverseOrder());
        Comparator.naturalOrder();

        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
