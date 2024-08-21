package ch1;

public class ScopeEx1 {
    public static void main(String[] args) {
        int a = 25;
        int c;
        int d = 0;
        {
            int b = 35;
            System.out.println(b);
            c = b + 50;
        }
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}
