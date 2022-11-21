package transport;

 public class Bus extends Transport {


     public Bus(String brand, String model, int productionYear, String productionCountry, String color) {
         super(brand, model, productionYear, productionCountry, color);
     }
     public void infoBus() {
     System.out.println(getBrand() + " " + getModel()+ ", " + getProductionYear() + " год выпуска, сборка " + getProductionCountry() + ", " + getColor()+ " цвета. ");
     }
 }
