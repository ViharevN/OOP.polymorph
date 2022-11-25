package Animals;

import java.util.Objects;

public class Mammals extends Animals {
    private String areal;
    private int moveSpeed;

    public Mammals(String name, int age, String areal, int moveSpeed) {
        super(name, age);
        if (areal != null && !areal.isBlank() && !areal.isEmpty()) {
            this.areal = areal;
        } else {
            this.areal = "default areal Mammals";
        }
        if (moveSpeed >= 0) {
            this.moveSpeed = 5;
        } else {
            this.moveSpeed = moveSpeed;
        }
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        if (areal != null && !areal.isBlank() && !areal.isEmpty()) {
            this.areal = areal;
        } else {
            this.areal = "default  setAreal Mammals";
        }
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        if (moveSpeed >= 0) {
            this.moveSpeed = 5;
        } else {
            this.moveSpeed = moveSpeed;
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
    public void walk() {
        System.out.println("млекопитающее гуляет");
    }
}
