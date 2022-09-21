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
    }
}
