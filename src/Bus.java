public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String fuelType) {
        super(brand, model, year, country, color, maxSpeed, fuelType);
    }

    @Override
    public void reFill() {
        String gas = "Бензин";
        String diesel = "Дизель";
        if (getFuelType().equals(gas)) {
            System.out.println("нужно заправлять бензином");
        }
        if (getFuelType().equals(diesel)) {
            System.out.println("нужно заправлять дизельным топливом");
        }
    }

    @Override
    public String toString() {
        return  " Марка: " + getBrand() +
                ", Модель: " + getModel() +
                ", Год выпуска: " + getYear() +
                ", Страна производитель: " + getCountry() +
                ", Цвет: " + getColor() +
                ", Максимальная скорость: " + getMaxSpeed() +
                ", Тип топлива: "+ getFuelType();
    }
}
