public class ComparisonOperator {
    public static void main(String[] args) {
        ClassA instanceA = new ClassA();
        ClassB instanceB = new ClassB();
        boolean result = instanceA instanceof ClassA;
        System.out.println(result);
        result = instanceB instanceof ClassA;
        System.out.println(result);
    }
}

class ClassA {}

class ClassB extends ClassA{}