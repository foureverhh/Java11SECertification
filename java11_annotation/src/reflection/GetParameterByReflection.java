package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
// reflect.Type
// ParameterizedType
public class GetParameterByReflection {
    public void test01(Map<String, Integer> map, int number) {
        System.out.println(map);
        System.out.println(number);
    }

    public Map<String, Integer> test02(){
        return null;
    }
    public static void main(String[] args) throws NoSuchMethodException {

        // get Parameter
        Method test01 = GetParameterByReflection.class.getDeclaredMethod("test01", Map.class, int.class);
        Type[] test01GenericParameterTypes = test01.getGenericParameterTypes();
        for (Type type: test01GenericParameterTypes) {
            System.out.println(type);
            if(type instanceof ParameterizedType) {
                Type[] actualTypeArguments =((ParameterizedType) type).getActualTypeArguments();
                for (Type argument: actualTypeArguments) {
                    System.out.println(argument);
                }
            }
        }

        // get return type
        Method test02 = GetParameterByReflection.class.getDeclaredMethod("test02");
        Type returnType = test02.getGenericReturnType();
        if(returnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) returnType).getActualTypeArguments();
            for (Type argument: actualTypeArguments) {
                System.out.println(argument );
            }
        }
    }
}
