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
        if (tripPrice <= 0) {
            this.tripPrice = 5000;
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public Integer getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(Integer timeOfTrip) {
        if (timeOfTrip == null) {
            this.timeOfTrip = 24;
        } else {
            this.timeOfTrip = timeOfTrip;
        }
    }

    public String getArrivalStationName() {
        return arrivalStationName;
    }

    public void setArrivalStationName(String arrivalStationName) {
        if (arrivalStationName != null && !arrivalStationName.isEmpty() && !arrivalStationName.isBlank()) {
            this.arrivalStationName = arrivalStationName;
        } else {
            this.arrivalStationName = "default arrivalStationName";
        }
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        if (endStation != null && !endStation.isBlank() && !endStation.isEmpty()) {
            this.endStation = endStation;
        } else {
            this.endStation = "default";
        }
    }

    public Integer getWagonsNum() {
        return wagonsNum;
    }

    public void setWagonsNum(Integer wagonsNum) {
        if (wagonsNum == null) {
            this.wagonsNum = 10;
        } else {
            this.wagonsNum = wagonsNum;
        }
    }


    @Override
    public void reFill() {
        String diesel = "????????????";
        if (getFuelType().equalsIgnoreCase(diesel)) {
            System.out.println("?????????? ???????????????????? ?????????????????? ????????????????");
        }
    }

    @Override
    public String toString() {
        return " ??????????: " + getBrand() +
                ", ????????????: " + getModel() +
                ", ?????? ??????????????: "+ getFuelType() +
                ", ?????? ??????????????: " + getYear() +
                ", ???????????? ??????????????????????????: " + getCountry() +
                ", ????????: " + getColor() +
                ", ???????????????????????? ????????????????: " + getMaxSpeed()+
                ", ???????? ??????????????: " + tripPrice +
                ", ?????????? ??????????????: " + timeOfTrip +
                ", ?????????????? ??????????????????: '" + arrivalStationName +
                ", ?????????????? ????????????????????: " + endStation +
                ", ???????????????????? ??????????????: " + wagonsNum;
    }
}
