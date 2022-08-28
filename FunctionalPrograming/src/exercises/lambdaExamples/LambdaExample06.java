package exercises.lambdaExamples;

import exercises.MockDataSource;
import model.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample06 {

    public static void main(String[] args) throws IOException {
        System.out.println("lambda not good choice for exception handling");
        List<Product> products = MockDataSource.getProducts();
        try(FileWriter writer = new FileWriter("products.txt")){
            for (Product product : products) {
                writer.write(product.toString() + "\n");
            }
            products.forEach(product -> {
                try {
                    writer.write(product.toString() + "\n"); //foreach accept() does not have any exception handling
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }catch (IOException | RuntimeException e) {
            System.err.println("An exception occurred: " + e.getMessage());
        };

    }
}
