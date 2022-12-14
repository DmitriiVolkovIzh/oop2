package setForIntegers.supermarket;

import java.util.Objects;

public class Product {

    private String name;

    private Double price;

    private Double weight;

    public Product(String name, Double price, Double weight) {
        setName(name);
        setPrice(price);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isEmpty())
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price<=0)
            throw new IllegalArgumentException("Заполните стоимость товара");
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight<=0)
            throw new IllegalArgumentException("Введите вес товара");
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name,product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
