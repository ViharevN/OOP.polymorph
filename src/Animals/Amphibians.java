package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String areal;

    public Amphibians(String name, int age, String areal) {
        super(name, age);
        if (areal != null && !areal.isBlank() && !areal.isEmpty()) {
            this.areal = areal;
        } else {
            this.areal = "default areal Amphibians";
        }
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" спит");
    }

    @Override
    public void move() {
        System.out.println(getName()+" двигается");
    }

    public void hunt() {
        System.out.println(getName()+" охотится");
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        if (areal != null && !areal.isBlank() && !areal.isEmpty()) {
            this.areal = areal;
        } else {
            this.areal = "default setAreal Amphibians";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(areal, that.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), areal);
    }

    @Override
    public String toString() {
        return "Название животного: " + getName() +
                ", Количество лет: " + getAge() +
                ", Место обитания: " + areal;
    }
}
