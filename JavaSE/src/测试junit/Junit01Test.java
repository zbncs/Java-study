package 测试junit;

import org.junit.*;

/*
1.Junit单元测试是做什么的？
    测试类中方法的正确性的。

2.Junit单元测试的优点是什么？
    JUnit可以选择执行哪些测试方法，可以一键执行全部测试方法的测试。
    JUnit可以生测试报告，如果测试良好则是绿色；如果测试失败，则是红色
    单元测试中的某个方法测试失败了，不会影响其他测试方法的测试。

3.
    定义的测试方法必须是无参数无返回值，且公开的方法。
    测试方法使用@Test注解标记。
    测试某个方法直接右键该方法启动测试。
    测试全部方法，可以选择类或者模块启动。
* */
public class Junit01Test {
    @Test
    public void show() {
        System.out.println("show");
    }
    @Test
    public void show1() {
        System.out.println("show1");
    }

    @Before
    public void before1() {
        System.out.println("Before");
    }
    @After
    public void after1() {
        System.out.println("After");
    }
    @BeforeClass
    public static void beforeClass1() {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void afterClass1() {
        System.out.println("AfterClass");
    }
}
