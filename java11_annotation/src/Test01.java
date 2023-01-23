import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Test01 {

    //Meta-annotation
    /*
    @Target: 用于描述注解的使用范围（即》被描述的注解可以用在什么地方）
    @Retention:  表示需要在什么级别保存该注释信息，用于描述注释的生命周期（source < class < runtime）
    source表示注释在源码有效
    class表示编译成class文件后依然有效
    runtime表示运行时依然有效
    @Document: 说明该注释将被包含在javadoc中
    @Inherited: 说明子类可以继承父类中的该注释
     */
    public static void main(String[] args) {

    }

}
