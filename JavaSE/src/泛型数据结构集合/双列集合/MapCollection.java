package 泛型数据结构集合.双列集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map<K,V>   K：键的数据类型；V：值的数据类型
 *
 * 键不能重复，值可以重复
 * 键和值是 一 一 对应的，通过键可以找到对应的值
 * （键 + 值） 一起是一个整体 我们称之为“键值对”或者“键值对对象”，在Java中叫做“Entry对象”。
 *
 * - public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
 * - public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
 * - public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 * - public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
 * - public boolean containKey(Object key): 判断该集合中是否有此键。
 *
 *
 * HashMap：
 * 此前的HashSet集合底层实现就是HashMap完成的，HashSet保存的元素其实就是HashMap集合中保存的键，底层结构是哈希表结构，具有键唯一，无序，特点。
 *
 * LinkedHashMap：
 * 底层结构是有链表和哈希表结构，具有键唯一，有序特点
 *
 * TreeMap：
 * 底层是有红黑树，具有键唯一，排序特点
 *
 * */
public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "1-1");
        map.put("2", "2-1");
        map.put("3", "3-1");

        // {1=1-1, 2=2-1, 3=3-1}
        System.out.println(map);

        System.out.println(map.remove("2"));

        System.out.println(map.get("1"));

        System.out.println(map.keySet());

        System.out.println(map.containsKey("3"));

        // entry 对象
        System.out.println(map.entrySet());

        // 循环1
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(value);
        }

        // 循环二
       // public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
        Map<String, String> map1 = new HashMap<>();

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }

    }
}
