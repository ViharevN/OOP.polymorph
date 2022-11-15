package Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;

    public Herbivores(String name, int age, String areal, int moveSpeed, String typeOfFood) {
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
            this.typeOfFood = "default typeOfFood";
        }
    }

    public void grace() {
        System.out.println("Травоядное пасется");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
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
