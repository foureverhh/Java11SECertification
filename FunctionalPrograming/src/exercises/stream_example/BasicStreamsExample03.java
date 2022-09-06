package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class BasicStreamsExample03 {
    public static void main(String[] args) {
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
        System.out.println("map is for one to one, flatMap is for one to many");
        Stream<Stream<String>> streamWithMap = products.stream()
                .map(product -> spaces.splitAsStream(product.getName()));
        Stream<String> streamWithFlatMap = products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()));
    }
}
