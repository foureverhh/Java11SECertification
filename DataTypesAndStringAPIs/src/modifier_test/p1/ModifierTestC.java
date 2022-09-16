package modifier_test.p1;

public class ModifierTestC extends ModifierTestA{
    public static void main(String[] args) {
        ModifierTestA a = new ModifierTestA();
        System.out.println("j is accessible within same package : " + a.j);
        System.out.println("k is accessible within same package : " + a.k);
    }
}
