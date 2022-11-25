package Animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "default Animal name";
        }
    }

    public Animals(String name, int age) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "default Animal name";
        }
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "default Animal setName";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
