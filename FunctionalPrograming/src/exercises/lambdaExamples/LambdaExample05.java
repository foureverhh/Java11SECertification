package exercises.lambdaExamples;

import exercises.MockDataSource;
import model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample05 {

    public static void main(String[] args) {
        List<Product> products = MockDataSource.getProducts();
        BigDecimal priceLimit = new BigDecimal("5.00");
        List<Product> cheapProduct = new ArrayList<>();
        products.forEach(product -> {
            if(product.getPrice().compareTo(priceLimit) < 0) {
                cheapProduct.add(product);
            }
        });
        cheapProduct.forEach(System.out::println);
    }
}
