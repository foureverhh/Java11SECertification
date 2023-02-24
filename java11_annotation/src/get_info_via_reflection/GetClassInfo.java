package get_info_via_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassInfo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> userClz = Class.forName("reflection.User");
        System.out.println("包名 - 类名" + userClz.getName());
        System.out.println();
        System.out.println("类名" + userClz.getSimpleName());
        System.out.println();
        System.out.println("clz.getFields() return public field");
        Field[] fields = userClz.getFields();
        for (Field field: fields) {
            System.out.println("public field: " + field);
        }
        System.out.println();
        System.out.println("clz.getDeclaredFields() return all fields");
        fields = userClz.getDeclaredFields();
        for (Field field: fields) {
            System.out.println("all field: " + field);
        }

        System.out.println();
        System.out.println("get public field via getFiled() by fieldName");
        Field genderField = userClz.getField("gender");
        System.out.println(genderField);

        System.out.println();
        System.out.println("get all field via getDeclaredField() by fieldName");
        Field nameField = userClz.getDeclaredField("name");
        System.out.println(nameField);

        System.out.println();
        System.out.println("================getMethods() return 本类和父类的 public method=================");
        Method[] methods = userClz.getMethods();
        for (Method method: methods) {
            System.out.println(method);
        }
        System.out.println();
        System.out.println("============getDeclaredMethods() return 本类的所有方法 all methods=================");
        methods = userClz.getDeclaredMethods();
        for(Method method: methods) {
            System.out.println(method);
        }
        System.out.println();
        System.out.println("getMethod via method name and parameter");
        Method getName = userClz.getMethod("getName", null);
        Method setName = userClz.getMethod("setName", String.class);
        System.out.println("getName(): " + getName);
        System.out.println("setName(): " + setName);

        System.out.println();
        System.out.println("=======getConstructor======");
        System.out.println("only public constructor");
        Constructor[] constructors = userClz.getConstructors();
        for (Constructor constructor: constructors) {
            System.out.println("constructor: " + constructor);
        }
        System.out.println("all constructor in this class ");
        constructors = userClz.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            System.out.println("Declared constructor: " + constructor);
        }
        System.out.println();
        System.out.println("get public constructor getConstructor by parameter");
        Constructor defualtConstructor = userClz.getConstructor(null);
        System.out.println("Default constructor: " + defualtConstructor);
        System.out.println("get all modifier constructors by parameters");
        Constructor nameIdConstructor = userClz.getDeclaredConstructor(String.class, int.class);
        System.out.println("private constructor via getDeclaredConstructor" + nameIdConstructor );

    }

}
