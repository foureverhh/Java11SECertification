package error_example;

public class NoClassDefFoundErrorExample {
    public static void main(String[] args) {
        try{
            new Calculator();      // ExceptionInitializerError
        } catch (Throwable t) {
            System.out.println(t); // sallow the above error
        }
        new Calculator();          //NoClassDefFoundErrorExample
    }

    public static class Calculator {
        static int undefined = 1/0;
    }
}
