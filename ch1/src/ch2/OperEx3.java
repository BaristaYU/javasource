package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        int pencil = 534;
        int student = 30;

        System.out.println("한 명당 연필 개수: " + (pencil / student));
        System.out.println("남는 연필 개수: " + (pencil % student));

        System.out.println("-----------------------------------------");

        double upper = 5;
        double lower = 10;
        double height = 7;

        System.out.println("사다리꼴의 넓이: " + ((upper + lower) * height) / 2);

        System.out.println("-----------------------------------------");

        int num = 24;
        int num2 = ((num / 10) + 1) * 10 - num;
        int num3 = 10 - (num % 10);

        System.out.println("ㅇㅇ: " + num2);
        System.out.println("ㅇㅇ: " + num3);
    }
}
