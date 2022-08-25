public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = x + y;

        x = 5;
        y = 3;
        z = 5 + (y = x + y);
        System.out.println("z: " + z); //13

        boolean flag = false;
        if ( flag = true) { //flag assigned as true
            z = 5;
        }else {
            z = 3;
        }
        System.out.println("z: " + z); //3

        byte xByte = 5;
        double yDouble = 3.0;
        xByte += yDouble; // 等同 xByte = (byte) (xByte * yDouble);
        //compound operator += -= *= /= %= widen or cast to the assigned type, not to the largest type
    }
}
