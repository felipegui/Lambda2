package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Television", 900.00));
        list.add(new Product("Keyboard", 350.50));
        list.add(new Product("Mousepad", 50.00));
        list.add(new Product("HD Case", 80.90));

        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);
    }
}
