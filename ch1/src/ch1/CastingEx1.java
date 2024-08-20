package ch1;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 91.1;
        int f = (int) d;

        System.out.printf("Score = %d", f);
        System.out.println("------------------------------");
        char a = 'a';
        f = a;
        System.out.println(f);
    }
}
