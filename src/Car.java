public class Car extends Transport {


    private Double engineVolume;


    private String transmission;
    private final String bodyType;
    private String regNumber;

    boolean tires;
    private String fuelType;
    public Key key;


    public static class Key {
        private final boolean remoteEngineSet;
        private final boolean keylessAccess;

        public Key(boolean keylessAccess, boolean remoteEngineSet) {
            this.keylessAccess = keylessAccess;
            this.remoteEngineSet = remoteEngineSet;
        }

        @Override
        public String toString() {
            return
                    " Удаленный запуск двигателя=" + remoteEngineSet +
                            ", Безключевой доступ=" + keylessAccess;
        }

    }


    public Car(String brand, String model, Double engineVolume, String color, Integer year, Integer maxSpeed, String country, String transmission,
               String bodyType, String regNumber, boolean tires, Car.Key key, String fuelType) {
        super(brand, model, year, country, color, maxSpeed, fuelType);


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }


        if (transmission == "" || transmission == null) {
            this.transmission = "Автомат";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == "" || bodyType == null) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (regNumber == null || regNumber.length() != 9 || regNumber.isBlank()) {
            this.regNumber = ("Регистрационный номер введен неверно");
        } else {
            this.regNumber = regNumber;
        }
        this.key = key;

        if (fuelType != null && !fuelType.isEmpty() && !fuelType.isBlank()) {
            this.fuelType = fuelType;
        } else {
            this.fuelType = "Укажите тип топлива для заправки";
        }
    }


    public Double getEngineVolume() {
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }


    public boolean isTires() {
        return tires;
    }


    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    public void setTransmission(String transmission) {
        if (transmission == "" || transmission == null) {
            this.transmission = "Автомат";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.length() != 9 || regNumber.isBlank()) {
            this.regNumber = ("Регистрационный номер введен неверно");
        } else {
            this.regNumber = regNumber;
        }
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Key getKey() {
        return key;
    }

    public boolean changeTires() {
        this.tires = !this.tires;
        return tires;
    }

    public void verifyRegNumber() {
        char[] chars = regNumber.toCharArray();
        if (    chars.length != 9
                || !Character.isAlphabetic(chars[0])
                || !Character.isAlphabetic(chars[1])
                || !Character.isDigit(chars[2])
                || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[4])
                || !Character.isAlphabetic(chars[5])
                || !Character.isAlphabetic(chars[6])
                || !Character.isDigit(chars[7])
                || !Character.isDigit(chars[8])
        ) {
            System.out.println("Номер задан неверно");
        } else {
            System.out.println(("Номер верный"));
        }
    }
    public void checkRegNumber() {
        char[] chars =  this.regNumber.toCharArray();
        if (regNumber.length() != 9) {
            System.out.println("Номер введен не верно!!!!!");
        }
        else if (    !Character.isAlphabetic(chars[0])
                && !Character.isDigit(chars[1])
                && !Character.isDigit(chars[2])
                && !Character.isDigit(chars[3])
                && !Character.isAlphabetic(chars[4])
                && !Character.isAlphabetic(chars[5])
                && !Character.isDigit(chars[6])
                && !Character.isDigit(chars[7])
                && !Character.isDigit(chars[8])
        ) {
            System.out.println("Номер введен не верно!!!!!");
        } else {
            System.out.println("номер верный");
        }
    }


    @Override
    public void reFill() {
        String gas = "Бензин";
        String diesel = "Дизель";
        String electrical = "ЭлектроКар";
        if (getFuelType().equalsIgnoreCase(gas)) {
            System.out.println("нужно заправлять бензином");
        }
        if (getFuelType().equalsIgnoreCase(diesel)) {
            System.out.println("нужно заправлять дизельным топливом");
        }
        if (getFuelType().equalsIgnoreCase(electrical)) {
            System.out.println("нужно заряжать электричеством");
        }
    }

    @Override
    public String toString() {
        return
                "Марка: " + getBrand()+
                ", Модель: " + getModel() +
                ", Год выпуска: " + getYear() +
                ", Страна производитель: " + getCountry() +
                ", Цвет: " + getColor() +
                ", Максимальная скорость: " + getMaxSpeed() +
                ", Объём двигателя: " + engineVolume +
                ", КПП: " + transmission +
                ", Кузов: " + bodyType +
                ", Регистрационный номер: " + regNumber +
                ", Резина летняя: " + tires +
                ", безключевой доступ: " + key;

    }

}