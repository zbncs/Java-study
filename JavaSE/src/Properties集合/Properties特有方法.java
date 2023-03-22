package Properties集合;

import java.util.Properties;
import java.util.Set;

/**
 * Object setProperty (String key, String value) 设置集合的键和值，都是String类型，相当于put方法
 *String getProperty (String key) 使用此属性列表中指定的键搜索属性,相当于get方法
 * Set<String> stringPropertyNames () 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串 , 相当于keyset方法
 * */

public class Properties特有方法 {
    public static void main(String[] args) {
        Properties properties1 = new Properties();

        properties1.setProperty("1", "01");
        properties1.setProperty("3", "03");
        properties1.setProperty("5", "05");

        Set<String> keySet = properties1.stringPropertyNames();
        for (String o : keySet) {
            String val = properties1.getProperty(o);
            System.out.println(o + ":" + val);
        }
    }
}
