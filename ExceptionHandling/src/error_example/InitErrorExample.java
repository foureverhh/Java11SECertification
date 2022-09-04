package error_example;

public class InitErrorExample {
    //case 1
    static int n = 2/0;

    static {
        //case 2
        int n = 1;
        if(n<2) {
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args) {
        System.out.println("those static int will trigger abnormal thing before main method is executed, so it will arise error");
    }
}
