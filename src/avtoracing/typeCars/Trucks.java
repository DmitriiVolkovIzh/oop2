package avtoracing.typeCars;

import avtoracing.Cars;

import avtoracing.driver.DriverC;
import avtoracing.driver.Skills;

import java.util.Objects;


public class Trucks <C extends DriverC & Skills> extends Cars  {

    private Capacity capacity;

    public Trucks(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void participant (C driver){
        System.out.println(driver.getName() + " " + driver.getDriverLicense() + " управляет "+ this );
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
    public void printType() {
        if (capacity==null) {
            System.out.println("Данных по грузовику не достаточно");}
        else {
            String from = getCapacity().getFrom() == null ?"" : getCapacity().getFrom()+"";
            String to = getCapacity().getTo() == null ?"" : getCapacity().getTo()+"";
            System.out.println("Грузоподъемность: от " + from + " до " + to + " т.");
        }
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
    public boolean service() {
        return Math.random()>0.75;
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
