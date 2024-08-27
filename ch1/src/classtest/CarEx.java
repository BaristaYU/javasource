package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        printCar(car);

        // 속성 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.model = "소나타";

        car.forward(); // 전진한다.
        car.backword(); // 후진한다.

        Car cars[] = new Car[2];
        System.out.println(cars[0]);
        // NullPointerException : 객체를 아직
        // System.out.println(cars[0].color);
        String str = null;
        // NullPointerException
        // System.out.println(str.length());

    }

    static void printCar(Car car) {
        System.out.println("제조사 : " + car.company); // 현대
        System.out.println("모델 : " + car.model); // 소나타
        System.out.println("색상 : " + car.color); // white
        System.out.println("최대속력 : " + car.maxSpeed); // 200

    }
}
