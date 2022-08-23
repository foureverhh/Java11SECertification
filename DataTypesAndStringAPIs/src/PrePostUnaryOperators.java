public class PrePostUnaryOperators {
    public static void main(String[] args) {
        System.out.println("Pre- / Post- Unary Operators **");
        int xInt = 1;
        System.out.println("xInt: " + xInt);
        ++xInt; //2
        System.out.println("xInt: " + xInt);
        --xInt; //1
        System.out.println("xInt: " + xInt);

        xInt = 4;
        int yInt = 7;
        int zInt = 3;
        int result = ++xInt + yInt + --zInt; //14
        System.out.println("result: " + result);

        xInt =5;
        result = ++xInt + xInt + ++xInt; // 6 + 6 + 7 = 19
        System.out.println("result: " + result);

        System.out.println("Post unary operator");
        xInt = 1;
        result = xInt++ + xInt + xInt++; // 1 + 2 + 2
        System.out.println("result: " + result);
        xInt++;
        System.out.println("xInt: " + xInt); //4
        xInt--;
        System.out.println("xInt: " + xInt); //3

    }
}
