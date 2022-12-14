package avtoracing.typeCars;

import avtoracing.Cars;
import avtoracing.driver.Mechanic;
import avtoracing.driver.Sponsor;
import avtoracing.driver.Driver;
import avtoracing.driver.Skills;


import java.util.HashSet;
import java.util.Objects;

public class PassengerCar extends Cars {
    public enum CarBody {
        HATCHBACK("Хетчбек"), SEDAN("Седан"), COUPE("Купе"),
        STATION_WAGON("Универсал"), SUV("Внедорожник"),
        CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"),
        MINIVAN("Минивэн"), ANY("неуказан тип кузова");
        private final String name;

        public String getName() {
            return name;
        }

        CarBody(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + name;
        }
    }

    static class DriverB extends Driver implements Skills{
        public DriverB(String name, double experience, String driverCard) {
            super(name, experience);
            setDriverCard(driverCard);
        }

        public String startDriving() {
            return getName() + " начал гонку";
        }

        public String stopDriving() {
            return getName() + " закончил гонку";
        }

        public String refill() {
            return getName() + " заправляется";
        }

        @Override
        public String toString() {
            return super.toString() + " имеет " + getDriverCard();
        }

        @Override
        public boolean equals(Object o) {
            return super.equals(o);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    private CarBody carBody;
    private final DriverB driver;
    private final HashSet<Sponsor> sponsors;
    private final HashSet<Mechanic<? super PassengerCar>> mechanics;
        public PassengerCar(String brand, String model, double engineVolume, String carBody,
                            String driverName, double experienceDriver) {
            super(brand, model, engineVolume);
            this.driver = new DriverB(driverName, experienceDriver, " права категории В ");
            setCarBody(carBody);
            this.sponsors = new HashSet<>();
            this.mechanics = new HashSet<>();
        }

        public void addSponsor(Sponsor sponsor, Integer amount) {
            Sponsor sponsor1 = new Sponsor(sponsor.getName(), sponsor.getType());
            try {
                sponsor1.letsSponsoring(amount);
            } catch (RuntimeException e) {
                return;
            }
            sponsor.addVehicle(this);
            this.sponsors.add(sponsor1);
        }

        public void showAllSponsors() {
            for (Sponsor sponsor : sponsors) {
                System.out.println(sponsor + " проспонсировал заезд данного "
                        + getBrand() + " на " + sponsor.getAmount() + " долларов");
            }
        }

        public void addMechanic(Mechanic<? super PassengerCar> mechanic) {
            Mechanic<PassengerCar> mechanic1 = new Mechanic<>(mechanic.getFirstName(), mechanic.getLastName(), mechanic.getCompany());
            mechanics.add(mechanic1);
            mechanic.takeVehicle(this);
        }

        public void showAllMechanics() {
            for (Mechanic<? super PassengerCar> mechanic : mechanics) {
                System.out.println(mechanic);
            }
        }

        public HashSet<Mechanic<? super PassengerCar>> getMechanics() {
            return mechanics;
        }

        public PassengerCar.DriverB getDriver() {
            return driver;
        }

        public CarBody getCarBody() {
            return carBody;
        }

        public void setCarBody(String carBody) {
            if (carBody == null || carBody.isEmpty()) this.carBody = CarBody.ANY;
            for (int i = 0; i < CarBody.values().length; i++) {
                assert carBody != null;
                if (carBody.equals(CarBody.values()[i].getName())) this.carBody = CarBody.values()[i];
            }
        }

        public String participate() {
            return "Водитель " + driver.getName() + " управляет " + getBrand() +
                    " и будет участвовать в соревнованиях";
        }

        @Override
        public String printType() {
            if (carBody != null) return carBody.toString();
            else return "Данных по транспортному средству не достаточно";
        }

        @Override
        public String startTrip() {
            return "Автомобиль " + super.startTrip() + " под управлением водителя " + driver.startDriving();
        }

        @Override
        public String stopTrip() {
            return "Автомобиль " + super.stopTrip() + " под управлением водителя " + driver.stopDriving();
        }

        @Override
        public String pitStop() {
            return this + " остановился для замены шин. " + driver.refill();
        }

        @Override
        public String bestLapTime() {
            return this + " под управлением водителя " + driver.getName() + " показал лучшее время круга";
        }

        @Override
        public String maxSpeed() {
            return this + " под управлением водителя " + driver.getName() + " показал лучшую скорость";
        }

        @Override
        public String toString() {
            if (carBody != null)
                return super.toString() + carBody;
            else return super.toString();
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
    }



