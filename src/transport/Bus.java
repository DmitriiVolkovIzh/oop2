package transport;

 public class Bus extends Transport {




     public Bus(String brand, String model, int productionYear, String productionCountry, String color) {
         super(brand, model, productionYear, productionCountry, color);
     }
     public void infoBus() {
     System.out.println(getBrand() + " " + getModel()+ ", " + getProductionYear() + " год выпуска, сборка " + getProductionCountry() + ", " + getColor()+ " цвета. ");
     }
     @Override
     public void refill() {
         System.out.println("Заправь автобус дизелем или бензином, если не знаешь, чем заправить, спроси у механика");

     }
 }
