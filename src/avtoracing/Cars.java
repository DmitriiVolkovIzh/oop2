package avtoracing;

import avtoracing.driver.Competing;
import java.util.Objects;

abstract public class Cars implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private static final String noInfo = "Информация не указана";
    public Cars(String brand, String model, double engineVolume){
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }
    abstract public String printType();
    private String getNoInfo(){
        return noInfo;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if(brand == null || brand.isEmpty())
            this.brand = noInfo;
        else this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if(model == null || model.isEmpty())
            this.model = noInfo;
        else this.model = model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Math.max(engineVolume, 10.0);
    }
    public String startTrip(){
        return getBrand() + " " + getModel();
    }
    public String stopTrip(){
        return getBrand() + " " + getModel();
    }
    @Override
    public String toString(){
        return brand + " модель " + model + " объем двигателя " +engineVolume + " л. ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars transport = (Cars) o;
        return  Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model,engineVolume);
    }

}
