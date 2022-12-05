package avtoracing.typeCars;

import avtoracing.Cars;
import avtoracing.driver.DriverB;
import avtoracing.driver.Skills;

import java.util.Objects;

public class PassengerCar<B extends DriverB & Skills> extends Cars  {

    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public PassengerCar(String brand, String model, double engineVolume, Body body) {
        super(brand, model, engineVolume);
        this.body = body;
    }

    public void participant (B driver){
        System.out.println(driver.getName() + " " + driver.getDriverLicense() + " управляет "+ this);
    }

    @Override
    public void startTrip() {
        System.out.println("Легковой автомобиль");
        super.startTrip();
    }

    @Override
    public void stopTrip() {
        System.out.println("Легковой автомобиль");
        super.stopTrip();
    }

    @Override
    public void printType() {
        if (body==null){
            System.out.println("Данных по авто не достаточно");
        } else System.out.println("Тип кузова: " + body);

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
        PassengerCar passengerCar = (PassengerCar) o;
        return super.equals(passengerCar);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean service() {
        return Math.random()>0.5;
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
