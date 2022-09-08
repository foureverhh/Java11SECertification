package exercises.stream_example;

import exercises.MockDataSource;
import model.Category;
import model.Product;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class AdvancedStreamsExample07 {
    public static void main(String[] args) {
        System.out.println("primitive stream");
        List<Product> products = MockDataSource.getProducts();

        DoubleStream prices = products.stream()
                .mapToDouble(product -> product.getPrice().doubleValue());

        double total = prices.sum();
        System.out.printf("The sum of all product prices is $ %.2f%n", total);

        DoubleSummaryStatistics summaryStatistics = products.stream()
                .mapToDouble(product -> product.getPrice().doubleValue())
                .summaryStatistics();

        System.out.printf("Count     : %d%n", summaryStatistics.getCount());
        System.out.printf("SUM       : %.2f%n", summaryStatistics.getSum());
        System.out.printf("Min       : %.2f%n", summaryStatistics.getMin());
        System.out.printf("Max       : %.2f%n", summaryStatistics.getMax());
        System.out.printf("Average   : %.2f%n", summaryStatistics.getAverage());
    }
}
