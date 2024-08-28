package modifier;

public class SingleTon {

    private static SingleTon singleton = new SingleTon();

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        return singleton;
    }
}
