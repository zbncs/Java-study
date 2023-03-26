package 注解;

public @interface MyAnno {
    public abstract String value() default "";
    int age();
    int[] arr();
}
