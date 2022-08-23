public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("/n ** Arithmetic Operators ** /n");
        byte byteResult = 5 + 3; // 8
        byte xByte = 3;
        byte yByte = 5;
        // byteResult = xByte + yByte;
        int forcedPromotedIntResult = xByte + yByte;

        short xShort = 5;
        yByte = 3;
        int intResult = xShort + yByte;


        int yInt = 3;
        long zLong = 10;

        // intResult = xShort + yByte * zLong; //Compile error
        long longResult = xShort + yInt + yByte * zLong;

        double dDouble = 2;
        // intResult = xShort + yByte * dDouble; //Compile error
        double doubleResult = xShort + yByte * dDouble;
    }
}
