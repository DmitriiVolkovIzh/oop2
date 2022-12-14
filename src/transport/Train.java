package transport;

public class Train extends Transport {
    private double priceTrip;
    private int timeTrip;
    private String departureStation; // Название станции отбытия
    private String arrivalStation; // Название станции прибития
    private int wagons;

    public Train(String brand, String model, int productionYear, String productionCountry, int maxSpeed, double priceTrip, int timeTrip, String departureStation, String arrivalStation, int wagons) {
        super(brand, model, productionYear, productionCountry,maxSpeed);
        if (maxSpeed >= 0)
            this.maxSpeed = maxSpeed;
        else this.maxSpeed = Math.abs(maxSpeed);

        if (priceTrip >= 0)
            this.priceTrip = priceTrip;
        else this.priceTrip = Math.abs(priceTrip);

        if (timeTrip >= 0)
            this.priceTrip = timeTrip;
        else this.timeTrip = Math.abs(timeTrip);

        if (departureStation == null || departureStation.isEmpty()) this.departureStation = "информация не указана";
        else this.departureStation = departureStation;

        if (arrivalStation == null || arrivalStation.isEmpty()) this.arrivalStation = "информация не указана";
        else this.arrivalStation = arrivalStation;

        if (wagons >= 0)
            this.wagons = wagons;
        else this.wagons =  Math.abs(wagons);
    }

    @Override
    public void refill() {
        System.out.println("Заправь поезд дизелем");

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        if (priceTrip >= 0)
            this.priceTrip = priceTrip;
        else this.priceTrip = Math.abs(priceTrip);
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    public void infoTrain() {
        System.out.println("Поезд " + getBrand() + ", модель "+ getModel()+", " + getProductionYear() +" год выпуска в России, скорость передвижения " +
                +getMaxSpeed()+ ", отходит от "+ getDepartureStation() + " и следует до станции " +getArrivalStation() +
                ". Цена поездки — " +getPriceTrip()+" рублей, в поезде " + getWagons() + " вагонов.");
    }
}
