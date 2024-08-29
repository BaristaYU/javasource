package extendstest;

public abstract class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    abstract void drive();

    void stop() {
        System.out.println(name + " 자동차를 멈춥니다.");
    }
}
