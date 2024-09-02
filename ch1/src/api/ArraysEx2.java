package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
    public static void main(String[] args) {
        String[] strArr = { "cat", "dog", "lion", "tiger" };
        // T,E,K,V : 대충 객체라는 뜻
        Arrays.sort(strArr, Comparator.reverseOrder());

        // int는 객체가 아님, sort하려면 객체가 들어가야함. Integer 사용
        Integer arr[] = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
