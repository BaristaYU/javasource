package api;

import java.util.Arrays;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // 배열 카피뜨기
        // 1) 배열 하나 더 만들어서 for문돌리기
        // 2) Arrays
        // 3) System

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        int[] destArr = new int[5]; // arr, destArr 인덱스 0번부터 복사
        System.arraycopy(arr, 0, destArr, 0, arr.length);

        // 정렬
        int arr3[] = { 3, 2, 0, 1, 4 };
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        // 검색 : Arrays.binarySearch(배열명,찾을값) -> index 리턴
        // 이진검색: 검색방법 중 가장 빠름 (정렬해서 tree마냥 반띵해서 추적)
        // 순차검색: 처음부터 끝까지 순차적으로 검색 (느려서 안씀)
        int arr4[] = { 3, 2, 0, 1, 4 };
        Arrays.sort(arr4);
        System.out.println(Arrays.binarySearch(arr4, 4));

        System.out.println(Arrays.equals(arr3, arr4));

        String[][] str2D = { { "aaa", "bbb" }, { "ccc", "ddd" } };
        String[][] str2D2 = { { "aaa", "bbb" }, { "ccc", "ddd" } };

        System.out.println(str2D);
        System.out.println(Arrays.toString(str2D)); // 2차원 배열은 안먹힘
        System.out.println(Arrays.deepToString(str2D));
        System.out.println(Arrays.equals(str2D, str2D2)); // 2차원 ㄴ
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        char[] chArr = { 'A', 'D', 'C', 'B', 'E' };
        System.out.println(chArr);
        System.out.println(Arrays.toString(chArr));

        System.out.println(Arrays.binarySearch(chArr, 'B'));
        Arrays.sort(chArr);
        System.out.println(Arrays.toString(chArr));
        System.out.println(Arrays.binarySearch(chArr, 'B'));

        List list = Arrays.asList(str2D);
    }
}
