package classtest;

public class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    // 메소드 오버로딩
    double divide(double a, double b) {
        return a / b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 못나눔 ㅅㄱ");
            return 0;
        }
        return a / b;
    }

    int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    void print() {
        return;
    }

}
