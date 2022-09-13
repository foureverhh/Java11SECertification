public class WrapperConversionMethods {
    public static void main(String[] args) {
        System.out.println("Wrapper Conversion Methods");
        Integer intWrapper = new Integer(7);
        byte bytVal = intWrapper.byteValue();
        short shtVal = intWrapper.shortValue();
        int intVal = intWrapper.intValue();
        long longVal = intWrapper.longValue();
        float floatVal = intWrapper.floatValue();

        String strNum = "1234";
        intVal = Integer.parseInt(strNum);
        floatVal = Float.parseFloat(strNum);
        System.out.println("intVal " + intVal);
        System.out.println("floatVal " + floatVal);

        boolean booVal = Boolean.parseBoolean("TRUE");
        System.out.println("boolVal -> " + booVal);
        booVal = Boolean.parseBoolean("true");
        System.out.println("boolVal -> " + booVal);

        booVal = Boolean.parseBoolean("false");
        System.out.println("boolVal -> " + booVal);
        booVal = Boolean.parseBoolean("troop");
        System.out.println("boolVal -> " + booVal);
        booVal = Boolean.parseBoolean(null);
        System.out.println("boolVal -> " + booVal);

        Long logWrap = Long.valueOf(23234);
        Integer intWrap = Integer.valueOf("23234");


        System.out.println("**Custom Wrapper** AutoBoxingUnboxing");
        Integer integer1 = 234;
        int intPrimitive1 = integer1;

        Integer integer2 = new Integer(234);
        int intPrimitive2 = integer2.intValue();



    }
}
