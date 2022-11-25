package Animals;

import java.util.Objects;

public class PredatoryAnimals extends Mammals {
    private String typeOfFood;

    public PredatoryAnimals(String name, int age, String areal, int moveSpeed, String typeOfFood) {
        super(name, age, areal, moveSpeed);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "default typeOfFood";
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "default setTypeOfFood";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PredatoryAnimals that = (PredatoryAnimals) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public void hunt() {
        System.out.println(getName()+" охотится");
    }

    @Override
    public String toString() {
        return "Название животного: " + getName() +
                ", Количество лет: " + getAge() +
                ", Место обитания: " + getAreal() +
                ", Скорость: " + getMoveSpeed() +
                ", Тип пищи: " + typeOfFood;
    }
}
