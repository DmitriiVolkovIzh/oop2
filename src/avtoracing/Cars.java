package avtoracing;

import avtoracing.typeCars.Competing;

import java.util.Objects;

public abstract class Cars implements Competing {

    private String brand;
    private String model;
    private double engineVolume;

    public Cars(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty()) this.brand = "неизвестный брэнд";
        else this.brand = brand;
        if (model == null || model.isEmpty()) this.model = "неизвестная модель";
        else this.model = model;
        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void startTrip(){
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }
    public void stopTrip(){
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public String toString() {
        return brand + " " + model + " c обьемом двигателя " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        Cars cars = (Cars) o;
        return Double.compare(cars.getEngineVolume(), getEngineVolume()) == 0 && Objects.equals(getBrand(), cars.getBrand()) && Objects.equals(getModel(), cars.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }
}
