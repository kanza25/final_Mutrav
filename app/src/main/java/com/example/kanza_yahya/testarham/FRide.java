package com.example.kanza_yahya.testarham;

/**
 * Created by KaNza_Yahya on 13/06/2018.
 */

public class FRide {
    public String key;
    private String riderSource;
    private String dateTime;
    private String riderDestination;
    private String riderFare;
    private String carName;
    private String carNum;
    private String carType;
    private String riderGender;
    private String riderName;
    private String riderPhone;
    private String riderSeats;



    public FRide() {
    }

    public FRide(String key, String riderSource, String dateTime, String riderDestination, String riderFare, String carName, String carNum, String carType, String riderGender, String riderName, String riderPhone, String riderSeats) {
        this.key = key;
        this.riderSource = riderSource;
        this.dateTime = dateTime;
        this.riderDestination = riderDestination;
        this.riderFare = riderFare;
        this.carName = carName;
        this.carNum = carNum;
        this.carType = carType;
        this.riderGender = riderGender;
        this.riderName = riderName;
        this.riderPhone = riderPhone;
        this.riderSeats = riderSeats;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getRiderGender() {
        return riderGender;
    }

    public void setRiderGender(String riderGender) {
        this.riderGender = riderGender;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public String getRiderPhone() {
        return riderPhone;
    }

    public void setRiderPhone(String riderPhone) {
        this.riderPhone = riderPhone;
    }

    public String getRiderSeats() {
        return riderSeats;
    }

    public void setRiderSeats(String riderSeats) {
        this.riderSeats = riderSeats;
    }

    public String getRiderSource() {
        return riderSource;
    }

    public void setRiderSource(String riderSource) {
        this.riderSource = riderSource;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getRiderDestination() {
        return riderDestination;
    }

    public void setRiderDestination(String riderDestination) {
        this.riderDestination = riderDestination;
    }

    public String getRiderFare() {
        return riderFare;
    }

    public void setRiderFare(String riderFare) {
        this.riderFare = riderFare;
    }
}
