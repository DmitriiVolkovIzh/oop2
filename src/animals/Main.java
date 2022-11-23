package animals;

import animals.amphibians.Amphibians;
import animals.birds.Flightless;
import animals.birds.Flyings;
import animals.mammals.Herbivores;
import animals.mammals.Predators;

public class Main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Газель",3,"тропическая степь",45.2);
        Herbivores giraffe = new Herbivores("Жираф",5,"тропическая степь",15);
        Herbivores horse = new Herbivores("Лощадь",10,"степь",70);

        Predators hyena = new Predators("Гиена",1,"степь",40);
        Predators tiger = new Predators("Тигр",3,"тропические леса",60);
        Predators bear = new Predators("Медведь",10,"Леса",40);

        Amphibians frog = new Amphibians("Лягушка",1,"пресноводные водоемы");
        Amphibians snake = new Amphibians("Уж пресноводный",1,"прибрежная зона рек и озер");

        Flightless peacock = new Flightless("Павлин",2,"саванны");
        Flightless penguin = new Flightless("Пингвин",2,"Антартика");
        Flightless dodo = new Flightless("Птица Додо",2,"лес");

        Flyings seagull = new Flyings("Чайка",1,"прибрежная зона рек,морей,озер");
        Flyings albatross = new Flyings("Альбатрос",2,"прибрежная зона морей,океанов");
        Flyings falcon = new Flyings("Сокол",2,"леса и степи");










    }
}
