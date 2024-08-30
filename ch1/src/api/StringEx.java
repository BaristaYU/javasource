package api;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "abc";
        String str4 = "abc";
        String str2 = new String("abc");
        char ch[] = { 'a', 'b', 'c' };
        String str3 = new String(ch);

        System.out.println(str1 == str4);
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));

        System.out.println("charAt(1) : " + str1.charAt(1));

        str1 = new String("Helloee!ee! Jaeeevea");

        System.out.println("Str1 길이 " + str1.length());

        char[] arr = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            arr[i] = str1.charAt(i);
        }

        System.out.println(Arrays.toString(arr));
        char ch2[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        System.out.println("indexOf(e) : " + str1.indexOf("e"));
        System.out.println("indexOf(Java) : " + str1.indexOf("Java"));
        System.out.println("indexOf(Java) : " + str1.indexOf("e", 4));
        System.out.println("lastIndexOf(Java) : " + str1.lastIndexOf("e", 4));
        System.out.println("lastIndexOf(Java) : " + str1.lastIndexOf("e"));

        System.out.println("contains(e) : " + str1.contains("e"));
        System.out.println("contains(f) : " + str1.contains("f"));

        str2 = "java.lang.String";
        System.out.println("startsWith(java) : " + str2.startsWith("java"));
        System.out.println("startsWith(lang) : " + str2.startsWith("lang"));
        str3 = "file.txt";
        System.out.println("endsWith(txt) : " + str3.endsWith("txt"));

        String animals = "catABdoABbear";
        String arrr[] = animals.split("AB");
        for (String string : arrr) {
            System.out.println(string);
        }
        arrr = animals.split("AB", 2);
        for (String string : arrr) {
            System.out.println(string);
        }

        int i = 100;
        String newStr = String.valueOf(i);

        str1 = "Hello World";
        char[] chr2 = str1.toCharArray();
        for (int j = chr2.length - 1; j >= 0; j--) {
            System.out.print(chr2[j]);
        }

        for (int k = str1.length() - 1; k >= 0; k--) {
            System.out.print(str1.charAt(k));
        }

        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.reverse());
    }
}
