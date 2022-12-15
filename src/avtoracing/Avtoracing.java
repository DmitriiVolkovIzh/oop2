package avtoracing;

import avtoracing.typeCars.*;
import avtoracing.driver.DriverB;
import avtoracing.driver.DriverC;
import avtoracing.driver.DriverD;

public class Avtoracing {
    public static void main(String[] args) {
        Buses <DriverD> maz = new Buses<>("МАЗ","251",10.5, Seats.MEDIUM);
        Buses <DriverD> neoplan = new Buses<>("Neoplan","N5218 SHD Starliner",12.4, Seats.SMALL);
        Buses <DriverD> yutong = new Buses<>("Yutong","zk6129h ",8.8, Seats.LARGE);
        Buses <DriverD> ikarus = new Buses<>("Ikarus","386",10.35, Seats.EXTRA_LARGE);

        PassengerCar <DriverB> porsche = new PassengerCar<>("Porsche ", "9ff GT9-CS", 3.5, Body.HATCHBACK);
        PassengerCar <DriverB> ferrari = new PassengerCar<>("Ferrari","FXX-K Evo",6.262, Body.COUPE);
        PassengerCar <DriverB> audi = new PassengerCar<>("Audi","R8 LMS",5.204,Body.MINIVAN);
        PassengerCar <DriverB> lamborghini = new PassengerCar<>("Lamborghini","Huracan Super Trofeo Evo",5.204, Body.HATCHBACK);

        Trucks<DriverC> volvo  = new Trucks<>("Volvo","The Wild Viking",12, Capacity.N3);
        Trucks<DriverC> scania = new Trucks<>("Scania","R999 RED PEARL",16,Capacity.N3);
        Trucks<DriverC> tata = new Trucks<>("Tata","Prima Race Truck",12,Capacity.N3);
        Trucks<DriverC> kamaz = new Trucks<>("КАМАЗ","435091",12.98,Capacity.N1);

        DriverB driverOne = new DriverB("Игорь","B",3);
        DriverC driverTwo = new DriverC("Василий","C",10);
        DriverD driverThree = new DriverD("Джон", "D",16);

        ferrari.participant(driverOne);
        ferrari.printType();
        ikarus.participant(driverThree);
        ikarus.printType();
        scania.participant(driverTwo);
        scania.printType();

        service(maz,neoplan,yutong,ikarus,
                porsche,ferrari,audi,lamborghini,
                volvo,scania,tata,kamaz);


    }
    public static void service(Cars...cars){
        for (Cars cars1 : cars) {
            serviceCars(cars1);
                }
            }
    private static void serviceCars (Cars cars){
        try{
            if(!cars.service())
                throw new RuntimeException("Автобмобиль " + cars.getBrand() + " " + cars.getModel() +
                        " не прошел диагностику");}
            catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}