package JavaApi;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  LocalDate：返回年月日
 *  LocalTime：返回时分秒
 *  LocalDateTime：年月日时分秒
 *
 * LocalDateTime  now()：当前系统时间
 *
 *  LocalDateTime.of(年, 月, 日, 时, 分, 秒)：初始化一个LocalDateTime对象
 *
 * */

public class LocalDateTimeCls {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(now);

        LocalDateTime time = LocalDateTime.of(2023, 03, 18, 21, 40, 00);
        //System.out.println(time);
        /**
         *
         * LocalDateTime类中方法：
         *
         *   int   getYear(): 返回年
         *   int    getMonthValue()：返回月份
         *   int   getDayOfMonth()：返回这个月的第几天
         *   int   getDayOfYear()：返回一年中第几天
         *   DayOfWeek  getDayOfWeek()：获取星期几
         *   int getHour()：获取小时
         *   int getMinute()：获取分钟
         */

         LocalDateTime now1 = LocalDateTime.now();

        System.out.println(now1.getYear());
        System.out.println(now1.getMonthValue());
        System.out.println(now1.getDayOfMonth());
        System.out.println(now1.getDayOfYear());
        System.out.println(now1.getDayOfWeek());
        System.out.println(now1.getHour());
        System.out.println(now1.getMinute());

        // LocalDateTimeToString();

        StringToLocalDateTime();
    }

    private static void StringToLocalDateTime() {
        /**
         *     将字符串转成LocalDateTime
         */

        String s0 = "2021/11/11 12:12:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(s0, dateTimeFormatter);
        System.out.println(dateTime);
    }

    private static void LocalDateTimeToString() {
        /**
         *  LocalDateTime格式化成字符串
         *
         */

        LocalDateTime ti = LocalDateTime.now();
        // 日期格式化对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss:SSS");
        String s = ti.format(dateTimeFormatter);

        System.out.println(s);
    }
}



