package exception;

public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            throw new Exception("고의사구");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
