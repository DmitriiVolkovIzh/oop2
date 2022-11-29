package avtoracing.driver;

import java.util.Objects;

public abstract class Driver implements Skills {
    private String name;
    private String driverLicense;
    private double driveExperience;

    public Driver(String name, String driverLicense, int driveExperience) {
        if(name == null || name.isEmpty()) this.name = " некорректное имя";
        else this.name = name;
        this.driverLicense = driverLicense;
        if (driveExperience <= 0) this.driveExperience = 1.5;
        else this.driveExperience = driveExperience;
    }

    public void setDriveExperience(int driveExperience) {
        this.driveExperience = driveExperience;
    }

    public String getName() {
        return name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public double getDriveExperience() {
        return driveExperience;
    }

    @Override
    public String toString() {
        return "Водитель" + name + " водительская категория " + driverLicense + ", опыт вождения " + driveExperience + " лет.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return Double.compare(driver.getDriveExperience(), getDriveExperience()) == 0 && Objects.equals(getName(), driver.getName()) && Objects.equals(getDriverLicense(), driver.getDriverLicense());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDriverLicense(), getDriveExperience());
    }
}
