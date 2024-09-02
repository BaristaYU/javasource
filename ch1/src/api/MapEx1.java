package api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("myId", "1234");
        map.put("asdf", "1234");
        map.put("asdf", "1111");

        System.out.println("myId value = " + map.get("myId"));
        System.out.println("myId value = " + map.containsKey("myId"));
        System.out.println("myId value = " + map.containsValue("1111"));

        Set<String> set = map.keySet();
        System.out.println(set);

        Collection<String> values = map.values();
        System.out.println(values);

        // map 요소 접근법 1
        Set<Entry<String, String>> set2 = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // map 요소 접근법 2 (key만 iterator로 변경)
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String id = iterator2.next();
            String value = map.get(id);
            System.out.println(id + " : " + value);
        }
    }
}
