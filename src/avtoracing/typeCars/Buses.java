package avtoracing.typeCars;

import avtoracing.Cars;
import avtoracing.driver.DriverD;
import avtoracing.driver.Skills;

import java.util.Objects;

public class Buses <D extends DriverD & Skills> extends Cars {

    private Seats seats;

    public Buses(String brand, String model, double engineVolume, Seats seats) {
        super(brand, model, engineVolume);
        this.seats = seats;
    }

    public Seats getSeats() {
        return seats;
    }

    @Override
    public void startTrip() {
        System.out.println("Автобус");
        super.startTrip();
    }
    public void participant (D driver){
        System.out.println(driver.getName() + " " + driver.getDriverLicense() + " управляет "+ this );
    }

    @Override
    public void stopTrip() {
        System.out.println("Автобус");
        super.stopTrip();
    }

    @Override
    public void printType() {
        if (seats==null){
            System.out.println("Данных по автобусу не достаточно");
        } else System.out.println("Количество мест: от " + seats.getFrom() + " до "+ seats.getTo() + " мест.");

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
    public boolean service() {
        System.out.println("Автобус "+getBrand()+ " " +getModel() + " в диагностики не требуется");
        return true;
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

