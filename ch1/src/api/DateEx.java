package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 D번째 날");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 d번째 날");
        System.out.println(sdf.format(d));

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(today);
        System.out.println(now);
        System.out.println(localDateTime);

        System.out.println("year " + today.getYear());
        System.out.println("month " + today.getMonthValue());
        System.out.println("day " + today.getDayOfMonth());

        System.out.println("시: " + now.getHour());
        System.out.println("분: " + now.getMinute());
        System.out.println("초: " + now.getSecond());

        System.out.println(today.plusDays(15));
        System.out.println(today.minusMonths(3));

    }
}
