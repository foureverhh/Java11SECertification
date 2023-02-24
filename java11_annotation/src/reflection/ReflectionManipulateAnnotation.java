package reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class ReflectionManipulateAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
       Class<?> employeeClz = Class.forName("reflection.Employee");
       // getAnnotation by reflection
       Annotation[] annotations = employeeClz.getAnnotations();
        for (Annotation annotation: annotations) {
            System.out.println(annotation); // get Type level annotation
        }
        TableAnnotation tableAnnotation = (TableAnnotation) employeeClz.getAnnotation(TableAnnotation.class);
        String value = tableAnnotation.value();
        System.out.println(value);

        Field id = employeeClz.getDeclaredField("id");
        id.setAccessible(true);
        FieldAnnotation idAnnotation = id.getAnnotation(FieldAnnotation.class);
        String table_id = idAnnotation.columnName();
        System.out.println(table_id);
        System.out.println(idAnnotation.type());
        System.out.println(idAnnotation.length());
    }
}
@TableAnnotation(value = "db_table_employee")
class Employee {
    @FieldAnnotation(columnName = "db_id", length = 10, type = "int")
    private int id;
    @FieldAnnotation(columnName = "db_age", length = 10, type = "int")
    private int age;
    @FieldAnnotation(columnName = "db_name", length = 10, type = "varchar")
    private String name;

    public Employee() {
    }

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface TableAnnotation {
    String value();

}
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface FieldAnnotation {
    String type();
    int length();
    String columnName();
}
