package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada","Granta",1.6, "желтого", 2015, "Россия","РКПП","Седан","О246ТР018",5,"летняя" );
        ladaGranta.infoCar();

        Car audiA8 = new Car("Audi","A8 50 L TDI quattro",3,"черного", 2020, "Германия","АКПП","Седан","О247ТВ059",5,"зимняя");
        audiA8.infoCar();

        Car bmw = new Car("BMW", "Z8",3,"черного", -1,"Германия","Робот","Хэтчбэк","Т346ТР116",4,"летняя");
        bmw.infoCar();

        Car kia = new Car("Kia","Sportage 4-го поколения",-2.4,"", 2018, "Южная Корея","Вариатор","Внедорожник","О296ТР102",5,"летняя");
        kia.infoCar();

        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевого",2016,"Южная Корея","РКПП","Седан","О24ВТ0716",1,"зимняя");
        hyundai.infoCar();




    }
}