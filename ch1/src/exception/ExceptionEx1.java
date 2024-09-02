package exception;

public class ExceptionEx1 {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);

                int a = Integer.parseInt("abc");
                System.out.println(a);
            } catch (ArithmeticException | NumberFormatException e) {
                // System.out.println("0으로 나눠지겠냐?");
                // e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }
    }
}
