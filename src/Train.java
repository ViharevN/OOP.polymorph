public class Train extends Transport {
    private int tripPrice;
    private Integer timeOfTrip;
    private String arrivalStationName;
    private String endStation;
    private Integer wagonsNum;
    private String fuelType;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed,
                 int tripPrice, Integer timeOfTrip, String arrivalStationName, String endStation, Integer wagonsNum, String fuelType) {
        super(brand, model, year, country, color, maxSpeed,fuelType);
        if (tripPrice <= 0) {
            this.tripPrice = 5000;
        } else {
            this.tripPrice = tripPrice;
        }
        if (timeOfTrip == null) {
            this.timeOfTrip = 24;
        } else {
            this.timeOfTrip = timeOfTrip;
        }
        if (arrivalStationName != null && !arrivalStationName.isEmpty() && !arrivalStationName.isBlank()) {
            this.arrivalStationName = arrivalStationName;
        } else {
            this.arrivalStationName = "default arrivalStationName";
        }
        if (endStation != null && !endStation.isBlank() && !endStation.isEmpty()) {
            this.endStation = endStation;
        } else {
            this.endStation = "default";
        }
        if (wagonsNum == null) {
            this.wagonsNum = 10;
        } else {
            this.wagonsNum = wagonsNum;
        }

    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public Integer getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(int timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }

    public String getArrivalStationName() {
        return arrivalStationName;
    }

    public void setArrivalStationName(String arrivalStationName) {
        this.arrivalStationName = arrivalStationName;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Integer getWagonsNum() {
        return wagonsNum;
    }

    public void setWagonsNum(int wagonsNum) {
        this.wagonsNum = wagonsNum;
    }


    @Override
    public void reFill() {
        String diesel = "Дизель";
        if (getFuelType().equalsIgnoreCase(diesel)) {
            System.out.println("нужно заправлять дизельным топливом");
        }
    }

    @Override
    public String toString() {
        return " Марка: " + getBrand() +
                ", Модель: " + getModel() +
                ", Тип топлива: "+ getFuelType() +
                ", Год выпуска: " + getYear() +
                ", Страна производитель: " + getCountry() +
                ", Цвет: " + getColor() +
                ", Максимальная скорость: " + getMaxSpeed()+
                ", Цена поездки: " + tripPrice +
                ", Время поездки: " + timeOfTrip +
                ", Станция отбывания: '" + arrivalStationName +
                ", Станция прибывания: " + endStation +
                ", Количество вагонов: " + wagonsNum;
    }
}
