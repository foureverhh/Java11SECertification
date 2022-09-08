package exercises.stream_example;

import java.math.BigInteger;
import java.util.UUID;
import java.util.stream.Stream;

public class AdvancedStreamsExample01 {
    public static void main(String[] args) {
        System.out.println("Stream building stream: generate() iterate()");
        Stream<UUID> uuids = Stream.generate(UUID::randomUUID).limit(10);
        uuids.forEach(System.out::println);

        Stream<BigInteger> powerOfTwo = Stream.iterate(BigInteger.ONE, num -> num.multiply(BigInteger.TWO));
        powerOfTwo.limit(20).forEach(System.out::println);

        Stream<Character> characterStream = Stream.iterate('A', letter -> letter.compareTo('Z') <= 0, letter -> (char) (letter + 1));
        characterStream.forEach(System.out::print);
    }
}
