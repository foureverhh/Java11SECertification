package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample06 {
    public static void main(String[] args) {
        System.out.println("Streams parallel .parallelStream");
        List<Product> products = MockDataSource.getProducts();

        products.parallelStream().forEach(System.out::println);


        Map<Category, List<Product>> productByCategorySequential = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        Map<Category, List<Product>> productByCategoryParallel = products.parallelStream()
                .collect(Collectors.groupingByConcurrent(Product::getCategory)); //group

    }
}
