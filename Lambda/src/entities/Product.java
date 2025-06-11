package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdate(Product prod) {
        prod.setPrice(prod.getPrice() * 1.1);
    }

    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
