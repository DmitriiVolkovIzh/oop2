package driver;

public class DriverB extends Driver {
    public DriverB(String name, String driverLicense, int driveExperience) {
        super(name, driverLicense, driveExperience);
        this.setDriverLicense("водительская категория B");
    }

    @Override
    public void startDriving() {
        System.out.println(getName() + "тронулся");
    }

    @Override
    public void stopDriving() {
        System.out.println(getName() + "остановился");
    }

    @Override
    public void refill() {
        System.out.println(getName() + "заехал заправиться");
    }
}
