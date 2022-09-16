import java.util.Random;

public class FieldsAndVariables {

    //Fields access is  class level and initialized by default
    static int field_a = 1000;                //class variable
    static String field_b = "static string";  //instance variable

    public void method_1() {
        //variables in method, even main method, are local variables, only access within method or code blocks
        short variable_a;
        String variable_b;
    }

    public static void main(String[] args) {
        boolean flag = (new Random()).nextBoolean();
        long variable_x;
        if (flag) {
            variable_x = 100L;
        } else {
            variable_x = 500L;
        }
        System.out.println("variable_x is " + variable_x);

        System.out.println("Primitive integers");
        byte maxByte = 127; //8bits
        byte minByte = -128;

        short maxShort = 32767; //16bits
        short minShort = -32768;

        int maxInt = 2147483647; //32bits
        int minInt = -2147483648;

        long maxLong = 9223372036854775807L; //64bits
        long minLong = -9223372036854775808L;

        System.out.println("Primitive decimals");
        float piFloat = 3.14f; //32 bit
        double piDouble = 3.14; //64 bit

        float floatNoF = 3;

        char aLetter = 'A';
        char aUnicode = '\u0041';
        char aNumber = 65;
        if(aLetter==aUnicode && aUnicode==aNumber) {
            System.out.println("aLetter -> " + aLetter + " , aUnicode -> " + aLetter + " , aNumber -> " + aNumber );
        }
    }



}

