package Properties集合;

import java.util.Properties;
import java.util.Set;

// 就是一个map结合
public class PropertiesDemo {
    public static void main(String[] args) {
        //
        Properties properties = new Properties();

        properties.put("1", "01");
        properties.put("3", "03");
        properties.put("5", "05");

        Set<Object> keySet = properties.keySet();
        for (Object o : keySet) {
            Object val = properties.get(o);
            System.out.println(o + ":" + val);
        }
    }
}
