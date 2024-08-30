package api;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        // equals(): Object에서 상속받은걸로 씀(주소값 비교)
        System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2));
        System.out.println("sb1.equals(sb2) : " + (sb1 == sb2));

        // String으로 변환해서 비교해도됨
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        System.out.println(s1.equals(s2));

        System.out.println("append     " + sb1.append("def"));
        System.out.println("append     " + sb1.insert(1, "hello"));
        System.out.println("append     " + sb1.delete(2, 5));
        System.out.println("append     " + sb1.replace(3, 5, "E"));

    }
}
