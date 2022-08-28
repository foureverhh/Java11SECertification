package exercises;

import model.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdaExample02 {
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
        printProducts(products,priceLimit);
    }
}
