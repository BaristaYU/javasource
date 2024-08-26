package classtest;

public class MyMath2 {

    // 인스턴스(멤버) 변수
    private long a;
    private long b;

    public MyMath2(long a, long b) {
        this.a = a;
        this.b = b;
    }

    // 인스턴스 메소드
    long add() {
        return a + b;
    }

    long subtract() {
        subtract(15, 5);
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    // 클래스 메소드
    static long add(long c, long d) {
        MyMath2 ma = new MyMath2(10, 5);
        System.out.println(ma.a);
        return c + d;
    }

    static long subtract(long c, long d) {
        return c - d;
    }

    static long multiply(long c, long d) {
        return c * d;
    }

    static long divide(long c, long d) {
        return c / d;
    }

}
