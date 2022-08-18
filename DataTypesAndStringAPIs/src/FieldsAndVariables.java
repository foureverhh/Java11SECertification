import java.util.Random;

public class FieldsAndVariables {
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

