package api;

public class MathEx2 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        while ((num1 != num2) || (num2 != num3)) {
            num1 = (int) (Math.random() * 3 + 1);
            num2 = (int) (Math.random() * 3 + 1);
            num3 = (int) (Math.random() * 3 + 1);
            System.out.print(num1 + "\t" + num2 + "\t" + num3);
            System.out.println();
        }
    }

}
