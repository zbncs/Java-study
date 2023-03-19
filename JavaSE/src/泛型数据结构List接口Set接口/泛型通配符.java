package 泛型数据结构List接口Set接口;

import java.util.List;

public class 泛型通配符 {
    public static void main(String[] args) {

    }

    /**
     * 1) 泛型通配符搭配集合使用一般在方法的参数中比较常见
     * 2) 在集合中泛型是不支持多态的，如果为了匹配任意类型，我们就会使用泛型通配符了。
     * 3) 方法中的参数是一个集合,集合如果携带了通配符,集合的类型会提升为Object类型。集合不能进行添加和修改操作 , 可以删除和获取
     *
     * */

    // ？表示任意类型
    public static void shuffle(List<?> list) {

    }
}
