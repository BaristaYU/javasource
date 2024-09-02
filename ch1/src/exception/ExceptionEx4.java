package exception;

public class ExceptionEx4 {
    public static void main(String[] args) {
        // try~catch~finally
        try {
            System.out.println("예외없음");
            // copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void copyFile() throws Exception {
        throw new Exception();
    }

    static void deleteTempFiles() {
        System.out.println("파일 삭제");
    }
}
