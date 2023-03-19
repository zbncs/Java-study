package 泛型数据结构List接口Set接口;

public class 自定义泛型接口 {
    public static void main(String[] args) {

    }
}

interface Person1<T> {
    abstract void add(T t);
}

class MyCollectionImpl implements Person1<String> {

    @Override
    public void add(String s) {

    }
}

class MyCollectionImpl1<E> implements Person1<E> {

    @Override
    public void add(E e) {

    }
}

