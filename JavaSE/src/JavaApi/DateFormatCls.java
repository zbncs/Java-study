package JavaApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  DateFormat: 抽象类，不能实例化；一般使用子类 SimpleDateFormat
 * */
public class DateFormatCls {
    public static void main(String[] args) throws ParseException {
//        formatDate();

        // 将字符串转成Date
        String s = "2020年10月31日 17:00:00";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");
        Date dd = simpleDateFormat1.parse(s);
        System.out.println(dd);

    }

    private static void formatDate() {
        Date date = new Date();

        // 日期格式化器对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String d = simpleDateFormat.format(date);
        System.out.println(d);
    }
}
