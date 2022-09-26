package viariable_scope;

public class ShadowingAndScope {
    public static int memberVariable = 200;
    public void someMethod() {
        System.out.println(memberVariable);
        int memberVariable = 2;
        System.out.println(memberVariable); // local variable will override class variable
        System.out.println(ShadowingAndScope.memberVariable); // then inside the class, have to write ShadowingAndScope.memberVariable to call the value
    }

    public static void main(String[] args) {
        ShadowingAndScope shadowingAndScope = new ShadowingAndScope();
        shadowingAndScope.someMethod();
        System.out.println(ShadowingAndScope.memberVariable);
    }
}

