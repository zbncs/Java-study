package IO流;

public class 异常捕获 {
    /**
     *
     * 1.try-catch-finally
     *
     * 2.try-with-resource格式 :
     *     try (创建流对象语句1 ; 创建流对象语句2 ...) {
     *         // 读写数据
     *     } catch (IOException e) {
     *         处理异常的代码...
     *     }
     *
     * JDK7版本对流的释放做了优化 . 可以使用 try-with-resource 语句 , 该语句确保了每个资源在语句结束时自动关闭。
     * 简单理解 : 使用此语句,会自动释放资源 , 不需要自己在写finally代码块了
     *
     * */
}
