public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;
    private String fuelType;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, String fuelType) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default brand";
        }
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default model";
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default country";
        }
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "default color";
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 60;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.fuelType = fuelType;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public abstract void reFill();


    @Override
    public String toString() {
        return  " Марка: " + brand +
                ", Модель: " + model +
                ", Год выпуска: " + year +
                ", Страна производитель: " + country +
                ", Цвет: " + color +
                ", Максимальная скорость: " + maxSpeed +
                ", Тип топлива: "+ fuelType;
    }
}
