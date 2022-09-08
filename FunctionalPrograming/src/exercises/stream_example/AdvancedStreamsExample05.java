package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample05 {
    public static void main(String[] args) {
        System.out.println("Collection  partitioningBy");
        List<Product> products = MockDataSource.getProducts();

        BigDecimal priceBoundary = new BigDecimal("5.00");

        Map<Boolean, List<Product>> partitionedProducts = products.stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice().compareTo(priceBoundary) < 0));

        System.out.println("Cheap products: ");
        partitionedProducts.get(true).forEach(System.out::println);

        System.out.println("expensive products: ");
        partitionedProducts.get(false).forEach(System.out::println);
    }
}
