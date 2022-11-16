public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    void infoCar() {
        System.out.println(brand + " " + model +", "+ productionYear +" год выпуска, сборка " + productionCountry + ", " + color +" цвета, объем двигателя — " + engineVolume +" л.с." );
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
}
