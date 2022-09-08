package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class BasicStreamsExample03 {
    public static void main(String[] args) {
        System.out.println("flatMap map");
        List<Product> products = MockDataSource.getProducts();
        products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .forEach(System.out::println);
        System.out.println("********************************");
        products.stream()
                .map(product -> String.format("The price of %s is $ %.2f",product.getName(),product.getPrice()))
                .forEach(System.out::println);
        System.out.println("********************************");
        Pattern spaces = Pattern.compile("\\s+");
        products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()))
                .forEach(System.out::println);
        System.out.println("*********************************");

        System.out.println("map is for one to one, flatMap is for one to many, map convert an array of string element to ONE object as Stream<Stream<String>>, flatMap convert the same array element direct to Stream<String>");
        System.out.println("*************streamWithMap*****************");
        Stream<Stream<String>> streamWithMap = products.stream()
                .map(product -> spaces.splitAsStream(product.getName()));
        streamWithMap.forEach(System.out::println);
        System.out.println("*************streamWithFlatMap*****************");
        Stream<String> streamWithFlatMap = products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()));
        streamWithFlatMap.forEach(System.out::println);
    }
}
