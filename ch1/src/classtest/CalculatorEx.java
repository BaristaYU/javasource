package classtest;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.powerOn();

        int result = calculator.plus(8, 6);
        System.out.println(result);

        calculator.powerOff();

        Calculator2 cal2 = new Calculator2();
        cal2.excute();

    }
}
