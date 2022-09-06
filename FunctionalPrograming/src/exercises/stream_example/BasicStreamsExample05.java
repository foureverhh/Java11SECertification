package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BasicStreamsExample05 {
    public static void main(String[] args) {
        System.out.println("Reducer and collection");
        List<Product> products = MockDataSource.getProducts();

        List<String> foodProductNames = products.stream()
                                            .filter(product -> product.getCategory() == Category.FOOD)
                                            .map(Product::getName)
                                            .collect(Collectors.toList());
        System.out.println("foodProductNames: " + foodProductNames);
        String categories = products.stream()
                .map(Product::getCategory)
                .distinct()
                .map(Category::name)
                .collect(Collectors.joining(";"));
        System.out.println("String categories: " + categories);
    }
}
