package class_loading;
//When a class would be initialized
public class ClassInitialization1 {
    static {
        System.out.println("Main class is loaded");
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // Call actively by new
        // Son son = new Son();

        // call actively by reflect
        // Son reflectedSon = (Son) Class.forName("class_loading.Son").newInstance();

        // static value from father class will not trigger son class initialization
        // System.out.println(Son.b);

        // array will not trigger class initialization
        // 数组只是一个变量的名字和空间，不会真的加载类
        Son[] sons = new Son[5];

        // Constant will not trigger class to initialize
        System.out.println(Son.M);

    }

}
class Father{
    static int b = 2;
    static {
        System.out.println("Father is loaded");
    }
}

class Son extends Father{
    static {
        System.out.println("Son is loaded");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}
