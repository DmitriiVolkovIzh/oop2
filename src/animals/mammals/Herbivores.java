package animals.mammals;

import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeFood;

    public Herbivores(String name, int age, String habitat, double speedOfMoving) {
        super(name, age, habitat, speedOfMoving);
        this.typeFood = "Траву";
    }
    public void graze(){
        System.out.println(getName() + " пасётся");
    }
    public String getTypeFood() {
        return typeFood;
    }
    public void setTypeFood(String typeOfFood) {
        if(typeOfFood == null || typeOfFood.isEmpty()) this.typeFood = getTypeFood(); else this.typeFood = typeOfFood;
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушает " + getTypeFood());
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
    @Override
    public void move() {
        System.out.println(getName() + " бегает");
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
        Herbivores herbivore = (Herbivores) o;
        return Objects.equals(typeFood, herbivore.typeFood);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

}
