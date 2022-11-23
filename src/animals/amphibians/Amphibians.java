package animals.amphibians;

import animals.Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String habitat;
    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        if(habitat == null || habitat.isEmpty()) this.habitat = "такой среды обитания не существует";
        else this.habitat = habitat;
    }
    public void hunt(){
        System.out.println("Земноводное животное охотится");
    }
    public String getHabitat(){
        return habitat;
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public void move() {
        System.out.println(getName() + " плавает");
    }

    @Override
    public String toString() {
        return super.toString() + habitat + " относится к классу " + getClass();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians amphibian = (Amphibians) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
