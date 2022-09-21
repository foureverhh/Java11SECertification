package var_variable;

public class LocalVariableTypeInference {
    static {
        var varStaticValue = 1;
    }

    {
        var varValue = 1;
    }

    //var variable1 = "error"; // compile error
    //static var variable2 = "error" //compel error

    public static void main(String[] args) {
        System.out.println("\nLocal Variable Type inference ** \n");
        System.out.println("var can only use as local variable and static or local initialisor");
        int x = 1;
        var y = 1;       // y is an int type
        var z = 3.14f;   // z is an int type

        LocalVariableTypeInference localVariableTypeInference = new LocalVariableTypeInference();
        int result = localVariableTypeInference.instanceMethod1();
        System.out.println("reuslt 1 -----> " + result);
        result = localVariableTypeInference.instanceMethod2();
        System.out.println("reuslt 2 -----> " + result);
        result = localVariableTypeInference.instanceMethod3();
        System.out.println("reuslt 3 -----> " + result);
        result = localVariableTypeInference.instanceMethod4();
        System.out.println("reuslt 4 -----> " + result);
        result = localVariableTypeInference.instanceMethod5();
        System.out.println("reuslt 5 -----> " + result);

        int int1,int2,int3;
        //var var1,var2, var3; //compile error

        // var nullvar = null //compile error
        var nullVar = (String) null;
        System.out.println("nullVar ----> " + nullVar);
    }

    public static String staticMethod() {
        var h = "hi there";
        return h;
    }

    public int instanceMethod1() {
        var q = 1;
        return q += 1;
    }
    public int instanceMethod2() {
        var q = 1;
        return ++q;
    }

    public int instanceMethod3() {
        var q = 1;
        return q++;
    }

    public int instanceMethod4() {
        var q = 1;
        q++;
        return q;
    }

    public int instanceMethod5() {
        var q = 1;
        return q++ + q; // q++ 值为1, q值为2
    }

    /*

    // var can not be used as parameter
    public void varInvalidAsParameter(var variable) {

    }

    // var can not be used as parameter
    public static void varInvalidAsParameter(var variable) {

    }

     */
}
