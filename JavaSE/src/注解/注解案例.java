package 注解;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

public class 注解案例 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        method_02();
    }
   private static void method_01() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("注解.BookStore");
        if (aClass.isAnnotationPresent(Book.class)) {
            Book declaredAnnotation = aClass.getDeclaredAnnotation(Book.class);
            String value = declaredAnnotation.value();
            String[] authors = declaredAnnotation.authors();
            double price = declaredAnnotation.price();

            System.out.println(price);
        }
    }

    private static void method_02() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("注解.BookStore");
        Method method = aClass.getMethod("sellBook");

        if (method.isAnnotationPresent(Book.class)) {
            Book book = method.getDeclaredAnnotation(Book.class);
            double price = book.price();
            String[] authors = book.authors();
            String value = book.value();

            System.out.println(Arrays.toString(authors));
        }
    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Book {
    String value();
    double price() default 100;
    String[] authors();

}

@Book(value = "修饰类", price = 101, authors = "zhangsan")
class BookStore {
    @Book(value = "java编程思想",authors = "代码艺术", price = 120)
    public void sellBook() {

    }
}


