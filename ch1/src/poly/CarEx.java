package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        // 자동 형변환
        car = fe;

        // 조상은 자손타입을 강제 형변환
        fe2 = (FireEngine) car;
        fe2.water();

        Car car2 = new Car();
        // ClasscastException 발생
        // car는 처음에 new FireEngine이 들어있기 때문에 에러가 나지 않으나
        // car2는 처음에 new Car가 들어있기 때문에 강제 형변환이 에러남. (애초에 안하는게 좋음)
        if (car2 instanceof FireEngine) {
            fe = (FireEngine) car2;
            fe.drive();
            System.out.println("ㅇㅇ");
        }
        if (car2 instanceof Car) {
            System.out.println("ㅇㅇ");
        }
    }
}
