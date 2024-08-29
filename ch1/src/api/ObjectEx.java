package api;

public class ObjectEx {
    public static void main(String[] args) {
        // java.lang.Object: root 클래스
        // 인스턴스 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        // equals(): 주소 비교
        System.out.println(obj1.equals(obj2) ? "같다" : "다르다");
        System.out.println(obj1 == obj2 ? "같다" : "다르다");

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1.equals(v2) ? "같다" : "다르다");
        System.out.println(v1 == v2 ? "같다" : "다르다");

        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
