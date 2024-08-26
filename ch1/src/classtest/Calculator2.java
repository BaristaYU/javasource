package classtest;

public class Calculator2 {

    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void println(String message) {
        System.out.println(message);
    }

    void excute() {
        println("실행결과 : " + avg(7, 10));
    }
}
