package error_example;

public class StackOverFlowErrorExample {
    public static void main(String[] args) {
        calculate(1,2);
    }

    private static void calculate(int a, int b) {
        calculate(a,b);
    }
}
