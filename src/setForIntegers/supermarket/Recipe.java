package setForIntegers.supermarket;

import java.util.Objects;

public class Recipe {

    private String name;

    private ProductList productList;

    private int totalCost;

    public Recipe(String name, ProductList productList, int totalCost) {
        setName(name);
        setProductList(productList);
        setTotalCost(totalCost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name,recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
