package exercises.stream_example;

import exercises.MockDataSource;
import model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreamsExample02 {
    public static void main(String[] args) {
        List<Product> products = MockDataSource.getProducts();
        Stream<Product> stream1 = products.stream();

        String[] array = new String[] {"one","two","three"};
        Stream<String> stream2 = Arrays.stream(array);

        //Stream factory
        Stream<String> stream3 = Stream.of("One","Two","Three");
        Stream<String> stream4 = Stream.ofNullable("four");
        Stream<?> stream5 = Stream.empty();

        //create random number via Stream
        //start is inclusive, end is exclusive
        IntStream dice = new Random().ints(1,7);

        try(BufferedReader in = new BufferedReader(new FileReader("README.md"))) {
            in.lines().forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }




}
