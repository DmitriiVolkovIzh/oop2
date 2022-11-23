package transport;

import java.util.Objects;

public abstract class Transport {
    protected int maxSpeed;
    private String brand;
    private String model;
    private int productionYear;
    private  String productionCountry;
    private String color;

    public abstract void refill();


    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        this.maxSpeed = maxSpeed;

        if (brand == null || brand.isEmpty()) this.brand = "информация не указана";
        else this.brand = brand;

        if (model == null || model.isEmpty()) this.model = "информация не указана";
        else this.model = model;

        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty()) this.productionCountry = "Россия";
        else this.productionCountry = productionCountry;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        if (color == null || color.isEmpty()) this.color = "белого";
        else this.color = color;

        if (brand == null || brand.isEmpty()) this.brand = "информация не указана";
        else this.brand = brand;

        if (model == null || model.isEmpty()) this.model = "информация не указана";
        else this.model = model;

        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty()) this.productionCountry = "Россия";
        else this.productionCountry = productionCountry;
    }


    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getColor() {
        return color;
    }
    public String setColor() {
        return color;}

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return maxSpeed == transport.maxSpeed && productionYear == transport.productionYear && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(productionCountry, transport.productionCountry) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, brand, model, productionYear, productionCountry, color);
    }
}
