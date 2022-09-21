package var_variable;

import java.util.Arrays;

public class Varargs {
    public static void someMethod(int... nums) {
        System.out.println(Arrays.toString(nums));
        if(nums!=null && nums.length > 0)
           System.out.println("First element is ----> " + nums[0]);
    }

    public static void main(String[] args) {
        Varargs.someMethod(1,2,3);
        Varargs.someMethod(); //empty array
        Varargs.someMethod(null); //pass null
        //Varargs.someMethod(1,2,null,3); //compile error

    }
}
