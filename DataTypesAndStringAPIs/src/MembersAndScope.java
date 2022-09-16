public class MembersAndScope {
    /*
    * Members
    * Static and instance fields and methods
    * could be inherited by subclasses
    *
    * static initializer, instance initializer and constructor are not member, can not be inherited by subclasses
    * */

    static {
        /*static initializer; not a member*/
    }

    {/* instance initializer; not a member*/}

    // static (class) field; a member
    public static int staticField = 1;

    // instance field; a member
    public int instanceField = 1;

    // static (class) method; a member
    public static void aStaticMethod() {

    }

    // instance method; a member
    public void anInstanceMethod() {

    }

    // constructor; not a member
    public MembersAndScope(){}
}
