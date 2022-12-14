package animals.mammals;

import animals.Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String habitat;
    private double speedOfMoving;

    public Mammals(String name, int age,String habitat,double speedOfMoving) {
        super(name, age);
        if(habitat == null || habitat.isEmpty()) this.habitat = "такой среды обитания не существует";
        else this.habitat = habitat;
        this.speedOfMoving = Math.abs(speedOfMoving);
    }
    public void walk(){
        System.out.println("Млекопитающее гуляет");}
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        if(habitat == null || habitat.isEmpty()) this.habitat = getHabitat(); else this.habitat = habitat;
    }
    public double getSpeedOfMoving() {
        return speedOfMoving;
    }
    public void setSpeedOfMoving(double speedOfMoving) {
        if(speedOfMoving < 0) this.speedOfMoving = getSpeedOfMoving(); else this.speedOfMoving = speedOfMoving;
    }
    @Override
    public String toString() {
        return super.toString() + " среда обитания " + habitat + " скорость передвижения " + speedOfMoving;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammal = (Mammals) o;
        return Double.compare(mammal.speedOfMoving, speedOfMoving) == 0 && Objects.equals(habitat, mammal.habitat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speedOfMoving);
    }
}
