package modifier_test.p1;

public class ModifierTestA {

    protected String k = "hello"; //same package, and all subclasses even subclass is not in same package

    private int i;     //class-private, accessible only within the class
    int j = 2;             //package-private, accessible under the same package
    public int l = 4;


}
