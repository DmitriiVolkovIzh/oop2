package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType; // тип кузова
    private String registrationNumber;
    private final int numberOfSeats;
    private String tire;

    private String noInfo = "default";

    public void infoCar() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, сборка " + productionCountry + ", " + color + " цвета, объем двигателя — "
                + engineVolume + " л.с. Коробка передач - "+transmission+". Тип кузова - "
                + bodyType + ". Регистрационный номер - "+ registrationNumber+ ". Кол-во мест: "+numberOfSeats+". Сезоность резины - "+tire);
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tire) {
        if (brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;
        if (model == null || model.isEmpty()) this.model = noInfo;
        else this.model = model;
        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) this.color = "белого";
        else this.color = color;
        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;
        if (productionCountry == null || productionCountry.isEmpty()) this.productionCountry = noInfo;
        else this.productionCountry = productionCountry;
        if (transmission == null || transmission.isEmpty()) this.transmission = noInfo;
        else this.transmission = transmission;
        if (bodyType == null || bodyType.isEmpty()) this.bodyType = noInfo;
        else this.bodyType = bodyType;
        if (registrationNumber.length()<8) this.registrationNumber = noInfo;
        else this.registrationNumber = registrationNumber;
        if (numberOfSeats <= 3 || numberOfSeats > 5 ) this.numberOfSeats = 5;
        else this.numberOfSeats = numberOfSeats;
        if (LocalDate.now().getDayOfMonth()<11 || LocalDate.now().getDayOfMonth()<3 ) this.tire = "летняя";
        else this.tire = "зимняя";
    }

    public String getBrand() {return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length()<8) this.registrationNumber = noInfo;
        else this.registrationNumber = registrationNumber;
        }

    public void setTire(String tire) {
        if (LocalDate.now().getDayOfMonth()<11 || LocalDate.now().getDayOfMonth()<3 ) this.tire = "летняя";
        else this.tire = "зимняя";

    }
}
