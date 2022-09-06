package exercises.stream_example;

import exercises.MockDataSource;
import model.Product;

import java.util.List;

public class BasicStreamsExample01 {
    public static void main(String[] args) {
        List<Product> products = MockDataSource.getProducts();
        products.forEach(System.out::println);
    }
}
