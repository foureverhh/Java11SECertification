public class NarrowingWideningCasting {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        System.out.println(byteValue + ", " + shortValue + ", " + intValue + ", " +longValue);

        float floatValue = 3.1415926f;
        double doubleValue = floatValue;
        System.out.println(floatValue + ", " + doubleValue);

        floatValue = intValue;
        doubleValue = longValue;
        System.out.println(floatValue + ", " + doubleValue);

        floatValue = 2147483647;
        doubleValue = 9223372036854775807L;
        System.out.println(floatValue + ", " + doubleValue);

        System.out.println("/n");

        longValue = 9223372036854775807L;
        intValue = (int) longValue;
        shortValue = (short) intValue;
        byteValue = (byte) shortValue;
        doubleValue = byteValue;
        floatValue = (float) doubleValue;
        System.out.println(byteValue + ", " + shortValue + ", " + intValue + ", " +longValue + ", " + floatValue + ", " + doubleValue);

        System.out.println("/n");
        shortValue = -100;
        char charValue = (char) shortValue;
        System.out.println("shortValue " + shortValue);
        System.out.println("charValue " + charValue);
        System.out.println("charValue " + (int)charValue);

        System.out.println("/n");
        shortValue = 100;
        charValue = (char) shortValue;
        System.out.println("shortValue " + shortValue);
        System.out.println("charValue " + charValue);
        System.out.println("charValue " + (int)charValue);

        System.out.println("/n");

        charValue = 65535;
        shortValue = (short) charValue;
        System.out.println("shortValue " + shortValue);
        System.out.println("charValue " + charValue);
        System.out.println("charValue " + (int)charValue);

        charValue = (char) -100;
        shortValue = (short) charValue;
        System.out.println("shortValue " + shortValue);
        System.out.println("charValue " + charValue);
        System.out.println("charValue " + (int)charValue);

    }
}
