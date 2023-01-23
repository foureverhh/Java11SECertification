package own_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TestOwnAnnotation2 {
    @MyAnnotation2(name = "Yuanheng Li", schools={"清华","上交"})
    public void test() {

    }
}
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数: 参数返回值类型 + 参数名称（）;
    String name() default "";
    int age() default 0;
    int id() default -1; // if -1, mean not exists
    String[] schools() default {"西工大","北大"};
}
