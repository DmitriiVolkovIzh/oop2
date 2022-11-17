public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    String noInfo = "default";

    void infoCar() {
        System.out.println(brand + " " + model +", "+ productionYear +" год выпуска, сборка " + productionCountry + ", " + color +" цвета, объем двигателя — " + engineVolume +" л.с." );
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if(brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;
        if(model == null || model.isEmpty()) this.model = noInfo;
        else this.model = model;
        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) this.color = "белого";
        else this.color = color;
        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;
        if(productionCountry == null || productionCountry.isEmpty()) this.productionCountry = noInfo;
        else this.productionCountry = productionCountry;
    }
}
