package string_and_date;

public class ImmutableString {
    public static void main(String[] args) {
        System.out.println("**Immutable String**");
        java.lang.String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("Result: " + str1 == str2);

        String str3 = new String("Hello");
        System.out.println("Result: " + str1 == str3);

        String str4 = 5 + 3 + "xyz" + 3 + 5;
        System.out.println("str4 " + str4);

        String str5 = "Pi is ";
        str5 += "3.14";
        System.out.println("str5 = " + str5);

        str5 += "__" + 5 * 4;
        System.out.println("str5 = " + str5);

        String str = "\t\b  \"Hi there!\"  \\\r\n\f";
        System.out.println("str has length-" + str.length());
        System.out.println(str);
        String trimmedStr = str.trim();
        System.out.println("trimmedStr has length " + trimmedStr.length());
        System.out.println(trimmedStr);
        String stripedStr = str.strip();
        System.out.println("stripedStr has length " + stripedStr.length());
        System.out.println(stripedStr);

        str = "  Hi there!  ";
        trimmedStr = str.trim();
        System.out.println(trimmedStr + trimmedStr.length() + "," + str.length());
        stripedStr = str.strip();
        System.out.println(stripedStr + stripedStr.length() + "," + str.length());
        String stripLeading = str.stripLeading();
        String stripTrailing = str.stripTrailing();
        System.out.println(stripLeading + stripLeading.length() + "," +stripTrailing +  stripTrailing.length());
    }
}
