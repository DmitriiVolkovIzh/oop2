package animals.mammals;

import java.util.Objects;

public class Predators extends Mammals {

    private String typeFood;

    public Predators(String name, int age, String habitat, double speedOfMoving) {
        super(name, age, habitat, speedOfMoving);
        this.typeFood = "Мясо";
    }
    public void hunt(){
        System.out.println(getName() + " охотится");
    }
    public String getTypeFood() {
        return typeFood;
    }
    public void setTypeOfFood(String typeOfFood) {
        if(typeOfFood == null || typeOfFood.isEmpty()) this.typeFood = getTypeFood(); else this.typeFood = typeOfFood;
    }
    @Override
    public void move() {
        System.out.println(getName() + " пассет травоядных");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушает " + getTypeFood());
    }
    @Override
    public String toString() {
        return super.toString() + typeFood + " относится к классу " + getClass();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predator = (Predators) o;
        return Objects.equals(typeFood, predator.typeFood);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}

