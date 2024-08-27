package extendstest;

public class Child extends Parent {
    void play() {
        System.out.println("집가고싶다..");
    }

    @Override
    void print() {
        System.out.println("자식 메소드");
    }
}
