package avtoracing;

import avtoracing.typeCars.Buses;
import avtoracing.typeCars.PassengerCar;
import avtoracing.typeCars.Trucks;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Avtoracing {
    public static void main(String[] args) {
        Buses <DriverD> maz = new Buses<>("МАЗ","251",10.5);
        Buses <DriverD> neoplan = new Buses<>("Neoplan","N5218 SHD Starliner",12.4);
        Buses <DriverD> yutong = new Buses<>("Yutong","zk6129h ",8.8);
        Buses <DriverD> ikarus = new Buses<>("Ikarus","386",10.35);

        PassengerCar <DriverB> porsche = new PassengerCar<>("Porsche ", "9ff GT9-CS", 3.5);
        PassengerCar <DriverB> ferrari = new PassengerCar<>("Ferrari","FXX-K Evo",6.262);
        PassengerCar <DriverB> audi = new PassengerCar<>("Audi","R8 LMS",5.204);
        PassengerCar <DriverB> lamborghini = new PassengerCar<>("Lamborghini","Huracan Super Trofeo Evo",5.204);

        Trucks<DriverC> volvo  = new Trucks<>("Volvo","The Wild Viking",12);
        Trucks<DriverC> scania = new Trucks<>("Scania","R999 RED PEARL",16);
        Trucks<DriverC> tata = new Trucks<>("Tata","Prima Race Truck",12);
        Trucks<DriverC> kamaz = new Trucks<>("КАМАЗ","435091",12.98);

        DriverB driverOne = new DriverB("Игорь","B",3);
        DriverC driverTwo = new DriverC("Василий","C",10);
        DriverD driverThree = new DriverD("Джон", "D",16);

        ferrari.participant(driverOne);
        ikarus.participant(driverThree);
        scania.participant(driverTwo);
    }
}