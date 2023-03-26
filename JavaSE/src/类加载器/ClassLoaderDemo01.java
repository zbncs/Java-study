package 类加载器;

/*
当程序在运行后，第一次使用某个类的时候，会将此类的class文件读取到内存，并将此类的所有信 息存储到一个Class对象中。

1.类加载器的作用?
	把硬盘上的.class文件读取到内存中并创建Class对象;

2.类加载器可以分为3种：
	1)引导类加载器(启动类加载器)    负载加载系统类库
	2)扩展类加载器        负责加载jdk扩展的类库
	3)应用程序类加载器    负责加载程序员自己写的类

java9之前的classloader：

    bootstrap classloader加载rt.jar，jre/lib/
    ext classloader加载jre/lib/ext
    application classloader加载-cp指定的类

java9及之后的classloader：

    bootstrap classloader加载lib/modules
    ext classloader更名为platform classloader，加载lib/modules
    application classloader加载-cp，-mp指定的类
* */

/*
"双亲委派模型"的工作机制：
某个"类加载器"收到类加载的请求，它首先不会尝试自己去加载这个类，而是把请求交给父级类加载器
因此，所有的类加载的请求最终都会传送到顶层的"启动类加载器"中
如果"父级类加载器"无法加载这个类，然后子级类加载器再去加载

(先冒泡再捕获)
*/

public class ClassLoaderDemo01 {
    public static void main(String[] args) {
        //
        Class<ClassLoaderDemo01> aClass = ClassLoaderDemo01.class;
        // 获取类加载器
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);

        // 获取类加载器的父类加载器 application classloader
        ClassLoader loaderParent = classLoader.getParent();
        System.out.println(loaderParent);

        // 父类加载器的父类加载器，最终为null   platform classloader
        ClassLoader grandParent = loaderParent.getParent();
        System.out.println(grandParent);

    }
}
