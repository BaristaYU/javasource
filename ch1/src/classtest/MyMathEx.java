package classtest;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        System.out.printf("add: %d, sub: %d, mul: %d, div: %f, div2: %d, max: %d",
                math.add(3, 5),
                math.subtract(3, 5),
                math.multiply(3, 5),
                math.divide(5l, 5l),
                math.divide(5, 0),
                math.max(3, 5));
    }

}
