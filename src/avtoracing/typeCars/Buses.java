package avtoracing.typeCars;

import avtoracing.Cars;
import driver.DriverB;
import driver.DriverD;
import driver.Skills;

import java.util.Objects;

public class Buses <D extends DriverD & Skills> extends Cars {

    public Buses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startTrip() {
        System.out.println("Автобус");
        super.startTrip();
    }
    public void participant (D driver){
        System.out.println(driver.getName() + " " + driver.getDriverLicense() + " управляет "+ this);
    }

    @Override
    public void stopTrip() {
        System.out.println("Автобус");
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
        Buses buses = (Buses) o;
        return super.equals(buses);
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

