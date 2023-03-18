package JavaApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodCls {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2021, 11, 11);
        LocalDate end = LocalDate.of(2023, 3, 18);
        Period between = Period.between(start, end);

        System.out.println(between.getYears()); // 1 年相减
        System.out.println(between.getMonths()); // 4: 月份相减
        System.out.println(between.getDays()); // 7：天数相减

        // Duration

        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 10, 14, 56, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, 3, 18, 22, 03, 0);

        Duration duration = Duration.between(localDateTime1, localDateTime2);

        System.out.println(duration.toDays());
        System.out.println(duration.toHoursPart());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
    }
}
