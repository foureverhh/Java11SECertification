package exercises.lambdaExamples;

import exercises.MockDataSource;
import model.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdaExample04 {
    static void printProducts(List<Product> products, BigDecimal priceLimit) {
        for (Product product: products) {
            if(product.getPrice().compareTo(priceLimit) < 0){
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        List<Product> products = MockDataSource.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        int numberOfCheapProducts = 0;
        int numberOfCheapProductsLambda = 0;

        for(Product product: products) {
            if(product.getPrice().compareTo(priceLimit) < 0) {
                numberOfCheapProducts++;
            }
        }

        products.forEach(product -> {
            if(product.getPrice().compareTo(priceLimit) < 0) {
                //numberOfCheapProductsLambda++; //Variable used in lambda expression should be final or effectively final
            }
        });

        System.out.println("There are " + numberOfCheapProducts + " cheap products");
        System.out.println("There are " + numberOfCheapProducts + " cheap products");
    }
}
