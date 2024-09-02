package api;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class IteratorEx {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(30);

        // add()
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");

        // list 접근법1
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
        }
        // list 접근법2
        for (String data : list) {

        }
        // list 접근법3
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }

        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("사과");
        set.add("복숭아");
        set.add("포도");

        // set 접근법1 (fori 안됨)
        for (String data : set) {

        }

        // set 접근법2
        iter = set.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }
    }
}
