package avtoracing.typeCars;

import avtoracing.Cars;

import driver.DriverC;
import driver.Skills;

import java.util.Objects;

public class Trucks <C extends DriverC & Skills> extends Cars  {

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void participant (C driver){
        System.out.println(driver.getName() + " " + driver.getDriverLicense() + " управляет "+ this);
    }

    @Override
    public void startTrip() {
        System.out.println("Грузовик");
        super.startTrip();
    }

    @Override
    public void stopTrip() {
        System.out.println("Грузовик");
        super.stopTrip();
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trucks tracks = (Trucks) o;
        return super.equals(tracks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public void pitStop() {
        System.out.println(this +" необходима замена шин");
    }

    @Override
    public void bestLapTime() {
        System.out.println(this + " лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this + " лучшая максимальная скорость");
    }
}
