import java.util.Arrays;

public enum PayEnum {
    //https://www.baeldung.com/java-enum-values
    //each every element is an object, and one constant, can call constructor
    WEI_XIN_PAY("weChat","www.weChat.com",'1'),
    ALI_PAY("ali","www.ali.com",'2'),
    UNION_PAY("union","www.union.com",'3');

    public final String lable;
    public final String url;
    public final char type;

    private PayEnum(String lable, String url, char type) {
        this.lable = lable;
        this.url = url;
        this.type = type;
    }

    public static void main(String[] args) {
        PayEnum aliPay = PayEnum.ALI_PAY;
        System.out.println("name: " + aliPay.lable);
        System.out.println("url: " + aliPay.url);
        System.out.println("type: " + aliPay.type);

        System.out.println("enum values " + Arrays.toString(PayEnum.values()));
        for (PayEnum p: PayEnum.values()) {
            System.out.println("PyaEnum is: " + p);
            System.out.println("PayEnum name() " + p.name() + " * " + (p.name() instanceof String));
            System.out.println("PayEnum lable - " + p.lable);
            System.out.println("PayEnum url - " + p.url);
            System.out.println("PayEnum type - " + p.type);
        }
    }


}
