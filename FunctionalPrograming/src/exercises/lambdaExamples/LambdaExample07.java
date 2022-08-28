package exercises.lambdaExamples;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class LambdaExample07 {

    interface ProductFactory {
        Product create(Category category, String name, BigDecimal price);
    }

    static boolean isExpensive(Product product) {
        return product.getPrice().compareTo(new BigDecimal("5.00")) >= 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("factory design pattern with interface, Method reference as interface impletation");
        List<Product> products = MockDataSource.getProducts();
        products.forEach(System.out::println);
        products.removeIf(LambdaExample07::isExpensive);
        products.forEach(System.out::println);
        products.stream().map(Product::getName).forEach(System.out::println);

        ProductFactory factory = Product::new; //
        Product blueBerries = factory.create(Category.FOOD, "Blueberries", new BigDecimal("6.95"));
        System.out.println("Factory pattern: " + blueBerries);
    }
}
