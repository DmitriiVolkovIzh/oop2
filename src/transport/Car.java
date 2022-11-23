package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType; // тип кузова
    private String registrationNumber;
    private final int numberOfSeats;
    private String tire;

    public void infoCar() {
        System.out.println(getBrand() + " " + getModel()+ ", " + getProductionYear() + " год выпуска, сборка " + getProductionCountry() + ", " + getColor()+ " цвета, объем двигателя — "
                + engineVolume + " л.с. Коробка передач - "+transmission+". Тип кузова - "
                + bodyType + ". Регистрационный номер - "+ registrationNumber+ ". Кол-во мест: "+numberOfSeats+". Сезоность резины - "+tire);
    }

    public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String productionCountry, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, String tire) {
        super(brand,model,productionYear,productionCountry,color);

        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;

        if (transmission == null || transmission.isEmpty()) this.transmission = "информация не указана";
        else this.transmission = transmission;

        if (bodyType == null || bodyType.isEmpty()) this.bodyType = "информация не указана";
        else this.bodyType = bodyType;

        if (registrationNumber.length()<8) this.registrationNumber = "информация не указана";
        else this.registrationNumber = registrationNumber;

        if (numberOfSeats <= 3 || numberOfSeats > 5 ) this.numberOfSeats = 5;
        else this.numberOfSeats = numberOfSeats;

        if (LocalDate.now().getDayOfMonth()<11 || LocalDate.now().getDayOfMonth()<3 ) this.tire = "летняя";
        else this.tire = "зимняя";
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void getTire() {
        if (LocalDate.now().getDayOfMonth()<11 || LocalDate.now().getDayOfMonth()<3 ) this.tire = "летняя";
        else this.tire = "зимняя";
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length()<8) this.registrationNumber = "информация не указана";
        else this.registrationNumber = registrationNumber;
        }
    public void setTire(String tire) {
        if (LocalDate.now().getDayOfMonth()<11 || LocalDate.now().getDayOfMonth()<3 ) this.tire = "летняя";
        else this.tire = "зимняя";
    }

    @Override
    public void refill() {
        System.out.println("Если у тебя бензиновый двигатель-заправь АИ-100, " +
                "если дизельный-ДТ, а электрокар подключи к зарядке");

    }
}
