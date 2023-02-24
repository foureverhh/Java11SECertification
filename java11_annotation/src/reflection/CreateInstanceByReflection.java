package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreateInstanceByReflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> userClz = Class.forName("reflection.User");

        //create instance
        User user = (User) userClz.newInstance();
        //call default constructor
        System.out.println(user);
        Constructor[] constructors = userClz.getDeclaredConstructors();
        for (Constructor constructor: constructors ) {
            System.out.println(constructor);
        }
        Constructor constructor = userClz.getConstructor(String.class,int.class, int.class);
        user = (User) constructor.newInstance("Name", 1, 18);
        System.out.println("New user by constructor: " + user);

        //Use reflect to call method
        User userForJim = (User) userClz.newInstance();
        Method setName =  userClz.getDeclaredMethod("setName", String.class);
        setName.invoke(userForJim, "Jim");
        System.out.println("userForJim method.invoke(targetObject, value)" + userForJim);

        //Use reflection to modify public field
        Field gender = userClz.getDeclaredField("gender");
        gender.set(userForJim, "male");
        System.out.println("userForJim public field.set(targetObject, value)" + userForJim);

        Field age = userClz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(userForJim, 12);
        System.out.println("userForJim private field.setAccessible(true) field.set(targetObject, value)" + userForJim);
    }
}
