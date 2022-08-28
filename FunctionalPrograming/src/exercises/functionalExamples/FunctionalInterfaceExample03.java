package exercises.functionalExamples;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample03 {
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
        BigDecimal priceLimit = new BigDecimal("2.00");
        Function<Product, BigDecimal> productToPrice = Product::getPrice;
        Function<BigDecimal, String> priceToMessage = price -> String.format("The price of %s is $ %.2f%n", name, price);

        findProduct(products, p-> p.getName().equalsIgnoreCase(name))
                .map(productToPrice)
                .map(priceToMessage)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.printf("The price of %s is not found", name));

        Function<Product,String> productToMessageByAndThen = productToPrice.andThen(priceToMessage); //andThen left to right

        findProduct(products, p-> p.getName().equalsIgnoreCase(name))
                .map(productToMessageByAndThen)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.printf("The price of %s is not found", name));

        Function<Product, String> productToMessageByCompose = priceToMessage.compose(productToPrice); //compose right to left
        findProduct(products, p-> p.getName().equalsIgnoreCase(name))
                .map(productToMessageByCompose)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.printf("The price of %s is not found", name));

        Function<List<Product>, List<Product>> foodProducts = ps -> ps.stream().filter(p->p.getCategory().equals(Category.FOOD)).collect(Collectors.toList());
        Function<List<Product>, List<Product>> cheaperProducts =ps -> ps.stream().filter(p->p.getPrice().compareTo(priceLimit) < 0).collect(Collectors.toList());
        Predicate<Product> isFoodProduct = p-> p.getCategory().equals(Category.FOOD);
        Predicate<Product> isProductCheaper = p-> p.getPrice().compareTo(priceLimit) < 0;

        findProduct(products, isFoodProduct.and(isProductCheaper))
                .map(productToMessageByCompose)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.printf("The price of %s is not found", name));

    }
}
