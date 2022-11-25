package Animals;

public class Birds extends Animals {
    private String areal;


    public Birds(String name, int age, String areal) {
        super(name, age);
        if (areal != null && !areal.isBlank() && !areal.isEmpty()) {
            this.areal = areal;
        } else {
            this.areal = "default areal Birds";
        }
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        if (areal != null && !areal.isBlank() && !areal.isEmpty()) {
            this.areal = areal;
        } else {
            this.areal = "default setAreal Birds";
        }
    }

    public void hunt() {
        System.out.println(getName() + " охотится");
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
}
