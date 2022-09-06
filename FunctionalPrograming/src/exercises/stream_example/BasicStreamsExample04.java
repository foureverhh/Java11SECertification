package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class BasicStreamsExample04 {
    public static void main(String[] args) {
        System.out.println("findFirst, findAny");
        List<Product> products = MockDataSource.getProducts();
        Optional<Product> opt1 = products.stream()
                .filter(product -> product.getCategory() == Category.OFFICE)
                .findFirst();
        System.out.println("********************************");
        Optional<Product> opt2 = products.stream()
                .filter(product -> product.getCategory() == Category.OFFICE)
                .findAny();
        System.out.println("****findAny will return any element that matches****");

        System.out.println("anyMatch, allMatch, nonMatch");
        boolean foundOfficeProduct = products.stream()
                        .anyMatch(product -> product.getCategory() == Category.OFFICE);
        System.out.println("Does the list contain at least one office product?" + foundOfficeProduct);

        BigDecimal priceLimit = new BigDecimal("10.00");
        boolean allProductsAreCheap = products.stream()
                        .allMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
        System.out.println("Are all products cheap? " + allProductsAreCheap);


        boolean allProductAreExpensive = products.stream()
                        .noneMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
        System.out.println("Are all products expensive? " + allProductAreExpensive);



        products.stream()
                .filter(product -> product.getCategory() == Category.OFFICE)
                .findFirst()
                .ifPresentOrElse(
                        product -> System.out.println(product.getCategory()),
                        ()-> System.out.println("nothing found"));

    }
}
