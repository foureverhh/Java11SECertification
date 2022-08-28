package exercises.lambdaExamples;

import exercises.MockDataSource;
import model.Product;

import java.util.Comparator;
import java.util.List;

public class LambdaExample01 {
    public static void main(String[] args) {
        List<Product> products = MockDataSource.getProducts();
        // products.sort((o1,o2) -> o1.getPrice().compareTo(o2.getPrice()));
        products.sort(Comparator.comparing(Product::getPrice)); //等同于上一行
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
