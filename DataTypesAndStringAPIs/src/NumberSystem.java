public class NumberSystem {
    public static void main(String[] args) {
        int w = 100;     //base 10
        int x = 0144;    //Octal literal base 8
        int y = 0x0064;  //Hexadecimal literal base 16
        int z = 0b1100100; //binary base 2

        if( w == x && x == y && y == z ) {
            System.out.println(" w == x == y == z");
        }else  {
            System.out.println("w, x, y ,z are not equal!");
        }

        int a = 1_000;
        int b = 017_50;
        int c = 0x0_3E8;
        int d = 0b11_1110_1000;

        if( a == b && c == b && c == d ) {
            System.out.println(" w == x == y == z");
        }else  {
            System.out.println("w, x, y ,z are not equal!");
        }
    }
}

