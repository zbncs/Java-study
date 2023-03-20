package 异常;

public class HandleException {
    /**
     *  异常体系
     *      Error 与  Exception (运行时异常，非运行时异常)
     *      Error 是代码无法处理的；
     *
     * 编译时异常因为在编译时就会检查，所以必须要写在方法后面进行显示声明
     * 运行时异常因为在运行时才会发生，所以在方法后面可以不写
     * 如果声明多个异常有子父类关系 , 那么只要声明一个父类即可(多态)
     *
     * 抛出异常
     *      throw new 异常类名()
     *
     *      注意 ：
     *
     *     1 抛出异常的格式必须在方法的内部完成
     *     2 如果手动抛出一个异常，下面的代码无法执行
     *
     *
     *     throws
     *  用在方法声明后面，跟的是异常类名
     *  表示声明异常，调用该方法有可能会出现这样的异常
     *  异常对象由JVM创建
     *
     *  throw
     *  用在方法体内，跟的是异常对象
     *  表示手动抛出异常对象，告知调用者数据传入有误
     *  异常对象我们自己创建
     *
     * */

    /**
     * try catch 捕获异常
     *
     * */

    public static void main(String[] args) {
        try {

        } catch (Exception e) {

        }

        int a = 1;
    }
}
