package api;

public class MathEx {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println("round(" + val + ") = " + Math.round(val));
        System.out.printf("ceil(%3.1f) = %3.1f\n", 1.1, Math.ceil(1.1));
        System.out.printf("floor(%3.1f) = %3.1f\n", 1.1, Math.floor(1.1));
        System.out.printf("round(%3.1f) = %d\n", 1.1, Math.round(1.1));
        System.out.printf("rint(%3.1f) = %3.1f\n", 1.5, Math.rint(2.5));

        System.out.printf("round(%3.1f) = %d\n", -1.5, Math.round(-1.5));
        System.out.printf("rint(%3.1f) = %3.1f\n", -1.5, Math.rint(-2.5));
        System.out.printf("ceil(%3.1f) = %3.1f\n", -1.5, Math.ceil(-1.5));
        System.out.printf("floor(%3.1f) = %3.1f\n", -1.5, Math.floor(-1.5));
    }
}
