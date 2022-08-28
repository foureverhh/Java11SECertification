package exercises.functionalExamples;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample02 {
    static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate) {
        for(Product product : products) {
            if(predicate.test(product)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        List<Product> products = MockDataSource.getProducts();
        Map<Category, List<Product>> productsByCategory1 = new HashMap<>();
        for (Product product: products) {
            Category category = product.getCategory();
            productsByCategory1.computeIfAbsent(category, c -> new ArrayList<>()).add(product);
        }
        System.out.println(productsByCategory1);
        Map<Category, List<Product>> productsByCategory2 = new HashMap<>();
        for (Product product: products) {
            Category category = product.getCategory();
            productsByCategory2.computeIfPresent(category, (c,v) -> {
                v = productsByCategory2.get(c);
                v.add(product);
                return v;}
            );
        }
        System.out.println(productsByCategory2);
        Map<Category, List<Product>> productsByCategory3 = products.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println("**" + productsByCategory1.equals(productsByCategory3));
    }
}
