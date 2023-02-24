package class_loading;

public class ClassLoadProcess {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
        System.out.println("A.m == 100 is " + (A.m == 100));

        /*
        * 1. 加载到内存，会产生一个类对应的class对象
        * 2. 链接。链接结束后m值为0
        * 3. 初始化，<clinit>(){
              System.out.println("class a static block is initialised");
              m = 300;
             m= 100
        * }
        *    m= 100
        * */
    }
}

class A {
    static {
        System.out.println("class a static block is initialised");
        m = 300;
    }
    static int m = 100;

    public A() {
        System.out.println("class A no parameter constructor");
    }
}
