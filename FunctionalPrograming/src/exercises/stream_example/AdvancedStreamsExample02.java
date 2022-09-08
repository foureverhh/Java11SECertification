package exercises.stream_example;

import exercises.MockDataSource;
import model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class AdvancedStreamsExample02 {
    public static void main(String[] args) {
        System.out.println("Stream Reducer example");
        List<Product> products = MockDataSource.getProducts();
        Optional<BigDecimal> opt = products.stream()
                .map(Product::getPrice)
                .reduce((result, element) -> result.add(element));
        opt.ifPresentOrElse(total -> System.out.printf("The total value of all products is: $ %.2f%n",total), ()-> System.out.println("no result"));

        BigDecimal total = products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.printf("The total value of all products is: $ %.2f%n", total);

        BigDecimal total1 = products.stream()
                .reduce(BigDecimal.ZERO, (result, product)-> result.add(product.getPrice()), (acc, element)->acc.add(element));
                        // initial value           Binary function<T,R,U> accumulator          BinaryOperator<T,T,T> combiner
        System.out.printf("The total value of all products is: $ %.2f%n", total1);
    }
}
