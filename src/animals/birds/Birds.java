package animals.birds;

import animals.Animals;

import java.util.Objects;

public abstract class Birds extends Animals {
    private String habitat;
    public Birds(String name, int age, String habitat) {
        super(name, age);
        if(habitat == null || habitat.isEmpty()) this.habitat = "небо"; else this.habitat = habitat;
    }
    public void hunt(){
        System.out.println("Птица охотится");
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        if(habitat == null || habitat.isEmpty()) this.habitat = getHabitat(); else this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + " среда обитания " + habitat;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds bird = (Birds) o;
        return Objects.equals(habitat, bird.habitat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}

