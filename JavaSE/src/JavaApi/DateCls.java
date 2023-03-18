package JavaApi;

import java.util.Date;

public class DateCls {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        // getTime(): long类型的毫秒值
        System.out.println(date.getTime());

        // setTime(long time): 设置
        date.setTime(1679144698222L);
        System.out.println(date);

        Date date1 = new Date(1000L * 60 * 24 * 1000);
//        System.out.println(date1);
    }
}





