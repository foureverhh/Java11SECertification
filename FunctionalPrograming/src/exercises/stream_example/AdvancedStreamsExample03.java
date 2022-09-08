package exercises.stream_example;

import exercises.MockDataSource;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class AdvancedStreamsExample03 {
    public static void main(String[] args) {
        System.out.println("Collection mutable reducer");
        List<Product> products = MockDataSource.getProducts();

        List<String> productNames1 = products.stream()
                .reduce(new ArrayList<>(),
                        (list, product) -> {
                            ArrayList<String> newArray = new ArrayList<>();
                            newArray.add(product.getName());
                            return newArray;
                        },
                        (list1, list2) -> {
                            ArrayList<String> newArray =  new ArrayList<>(list1);
                            newArray.addAll(list2);
                            return newArray;
                        });

        List<String> productNames2 = products.stream()
                .collect(ArrayList::new,
                        (list, product) -> list.add(product.getName()),
                        ArrayList::addAll);
    }
}
