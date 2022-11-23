package animals.birds;

import java.util.Objects;

public class Flyings extends Birds {
    private String wayToMove;
    public Flyings(String name, int age, String habitat) {
        super(name, age, habitat);
        wayToMove = " летает в небе";
    }
    public void flight(){
        System.out.println("Птичка летает");
    }
    public String getWayToMove() {
        return wayToMove;
    }
    public void setWayToMove(String wayToMove) {
        if(wayToMove == null || wayToMove.isEmpty()) this.wayToMove = getWayToMove(); else this.wayToMove = wayToMove;
    }
    @Override
    public void eat() {
        System.out.println(getName() + " питается насекомыми");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
    @Override
    public void move() {
        System.out.println(getName() + getWayToMove());
    }
    @Override
    public String toString() {
        return super.toString() + wayToMove + " относится к классу " + getClass();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flyings flyings = (Flyings) o;
        return Objects.equals(wayToMove, flyings.wayToMove);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wayToMove);
    }
}

