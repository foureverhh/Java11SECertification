package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample04 {
    public static void main(String[] args) {
        System.out.println("Collection  collectors");
        List<Product> products = MockDataSource.getProducts();

        Map<Category, BigDecimal> totalPerCategory1 = products.stream()
                .collect(Collectors.toMap(
                        Product::getCategory, //Key   mapper function
                        Product::getPrice,    //Value mapper function
                        BigDecimal::add       // Merge function for price with same category
                ));

        Map<Category, BigDecimal> totalPerCategory2 = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getPrice, Collectors.reducing(BigDecimal.ZERO,(acc, item)->acc.add(item)))));
        System.out.println("toMap, groupingBy result equals: " + totalPerCategory1.equals(totalPerCategory2));

        Map<Category, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        Map<Category, List<String>> productNameByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getName, Collectors.toList()))
                );
    }
}
