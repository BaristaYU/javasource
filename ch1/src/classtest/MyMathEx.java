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

        MyMath2 math2 = new MyMath2(15, 5);
        System.out.println("15+5= " + math2.add());
        System.out.println("15-5= " + math2.subtract());
        System.out.println("15*5= " + math2.multiply());
        System.out.println("15/5= " + math2.divide());

        System.out.println("15+5= " + MyMath2.add(15, 5));
        System.out.println("15-5= " + MyMath2.subtract(15, 5));
        System.out.println("15*5= " + MyMath2.multiply(15, 5));
        System.out.println("15/5= " + MyMath2.divide(15, 5));
    }

}
