package exception;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // method1();

        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        // method2();
    }

    static void method2() throws Exception {
        // throw new Exception();
    }

}
