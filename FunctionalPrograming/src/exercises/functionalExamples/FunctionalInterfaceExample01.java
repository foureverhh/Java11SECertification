package exercises.functionalExamples;

import exercises.MockDataSource;
import model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalInterfaceExample01 {
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
        String name = "Spaghetti";
        Product product = new Product();
        Optional<Product> targetProduct = findProduct(products,p -> p.getName().equalsIgnoreCase(name));
        if(targetProduct.isPresent()) {
            product = targetProduct.get();
        }
        System.out.println("Product is: " + product );
        String newName ="XX";
        findProduct(products, p-> p.getName().equalsIgnoreCase(newName))
                .map(Product::getPrice)
                .ifPresentOrElse(price-> System.out.printf("The price of %s is $ %.2f", newName, price),
                        () -> System.out.printf("The price of %s is not found", newName));

    }
}
