package own_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TestOwnAnnotation1 {
    @MyAnnotation
    public void test() {

    }

    @Target(value = {ElementType.METHOD})// Target decide on which level place, the annotation could be used
    @Retention(value = RetentionPolicy.RUNTIME)
    @interface MyAnnotation {

    }
}
