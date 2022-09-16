import modifier_test.p1.ModifierTestA;

public class ComparisonOperator {
    public static void main(String[] args) {
        ModifierTestA instanceA = new ModifierTestA();
        ClassB instanceB = new ClassB();
        boolean result = instanceA instanceof ModifierTestA;
        System.out.println(result);
        result = instanceB instanceof ModifierTestA;
        System.out.println(result);
    }
}

class ClassA {}

class ClassB extends ModifierTestA {}
