package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Television", 1200.00));
        list.add(new Product("Keyboard", 500.00));
        list.add(new Product("Mousepad", 80.00));

        double min = 100.00;

        Predicate<Product> pred = prod -> prod.getPrice() >= min;

        list.removeIf(pred);

        for (Product prod : list) {
            System.out.println(prod);
        }
    }
}
