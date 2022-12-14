package avtoracing.driver;

import avtoracing.Cars;

import java.util.HashSet;
import java.util.Objects;

public class Sponsor {
    enum TypeOfSponsors{
        COMPANY("Компания"),
        INDIVIDUAL("Частный инвестор");
        private final String type;
        TypeOfSponsors(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
        @Override
        public String toString() {
            return type;
        }
    }
    private String name;
    private int amount;

    private TypeOfSponsors type;

    private final HashSet<Cars> vehicles;

    public Sponsor(String name, String type) {
        setName(name);
        setType(type);
        this.vehicles = new HashSet<>();
    }
    public void letsSponsoring(Integer amount){
        setAmount(amount);
    }
    public void addVehicle(Cars cars){
        vehicles.add(cars);
    }
    public void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank())
            this.name = "Введите название спонсора";
        else this.name = name;
    }
    public void setAmount(Integer amount) {
        if(amount == null || name.isBlank())
            throw new RuntimeException("Необходима сумма взноса");
        else this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public void setType(String type) {
        if(type.equals(TypeOfSponsors.COMPANY.type)) this.type = TypeOfSponsors.COMPANY; else this.type = TypeOfSponsors.INDIVIDUAL;
    }
    public String getType() {
        return type.getType();
    }
    @Override
    public String toString() {
        return type.getType() + " " + getName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.amount, amount) == 0 && Objects.equals(name, sponsor.name) && type == sponsor.type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, amount, type);
    }
}



