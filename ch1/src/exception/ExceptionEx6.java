package exception;

public class ExceptionEx6 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFile();
        } catch (SpaceException e) {
            System.out.println("에러: " + e.getMessage());
            e.printStackTrace();
        } catch (MemoryException e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }

    }

    static void copyFile() {

    }

    static void deleteTempFiles() {

    }

    static boolean enoughMemory() {
        return true;
    }

    static boolean enoughSpace() {
        return false;
    }

}
