package Animals;

import java.util.Objects;

public class FlyBirds extends Birds {
    private String typeMovement;

    public FlyBirds(String name, int age, String areal, String typeMovement) {
        super(name, age, areal);
        if (typeMovement != null && !typeMovement.isEmpty() && !typeMovement.isBlank()) {
            this.typeMovement = typeMovement;
        } else {
            this.typeMovement = "default typeMovement Birds";
        }
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        if (typeMovement != null && !typeMovement.isEmpty() && !typeMovement.isBlank()) {
            this.typeMovement = typeMovement;
        } else {
            this.typeMovement = "default setTypeMovement Birds";
        }
    }

    public void fly() {
        System.out.println(getName() + " летает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyBirds that = (FlyBirds) o;
        return Objects.equals(typeMovement, that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }

    @Override
    public String toString() {
        return "Название животного: " + getName() +
                ", Количество лет: " + getAge() +
                ", Место обитания: " + getAreal() +
                ", Тип передвижения: " + getTypeMovement();
    }
}
