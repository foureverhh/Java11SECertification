import java.util.Random;
import java.util.stream.Stream;

public class MathAPIs {
    public static void main(String[] args) {
        System.out.println("** Math APIS **");
        Stream.generate(new Random()::nextDouble).limit(1).forEach(System.out::println);

       // System.out.println("new Random::nextDouble -> " + d);
        for (int i = 0; i < 4; i++) {
            double result = Math.random();
            System.out.printf("Math.random() = %.20f%n", result);
        }
        double PI = 3.14;
        long longX = Math.round(PI);

        int intA = 3;
        int intB = 4;
        int intMin = Math.min(intA, intB);
        int intMax = Math.max(intA, intB);
    }
}
