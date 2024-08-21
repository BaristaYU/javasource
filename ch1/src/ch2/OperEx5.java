package ch2;

public class OperEx5 {
    public static void main(String[] args) {
        // float f1 = 0.1f;
        // double d1 = 0.1;
        // int i1 = 1;
        // long l1 = 1l;
        // System.out.println("i1 == l1 = " + (i1 == l1));
        // System.out.println("f1 == d1 = " + (f1 == d1));

        String str1 = "유용균", str2 = "유용균";
        String str3 = new String("유용균");
        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1 == str3 = " + (str1 == str3));
        System.out.println("str1 == str3 = " + str1.equalsIgnoreCase(str3));
    }
}
