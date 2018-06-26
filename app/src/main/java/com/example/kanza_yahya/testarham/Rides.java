package com.example.kanza_yahya.testarham;

/**
 * Created by KaNza_Yahya on 13/06/2018.
 */

public class Rides {
    String riderId;
    String riderName;
    String riderGender;
    String carType;
    String riderPhone;
    String carNum;
    String riderSeats;
    String carName;
    String riderSource;
    String riderDestination;
    String riderFare;
    String dateTime;

    public Rides(){

    }

    public Rides( String riderId, String riderName,String carType,String riderPhone, String carNum ,String riderSeats, String carName, String riderSource,String riderDestination,String dateTime,  String riderFare,String riderGender) {
        this.riderId = riderId;
        this.riderName = riderName;
        this.riderGender = riderGender;
        this.carType = carType;
        this.riderPhone = riderPhone;
        this.carNum = carNum;
        this.riderSeats = riderSeats;
        this.carName = carName;
        this.riderSource = riderSource;
        this.riderDestination = riderDestination;
        this.riderFare = riderFare;
        this.dateTime = dateTime;
    }

    public String getRiderId() {
        return riderId;
    }

    public String getRiderName() {
        return riderName;
    }

    public String getRiderGender() {
        return riderGender;
    }

    public String getCarType() {
        return carType;
    }

    public String getRiderPhone() {
        return riderPhone;
    }

    public String getCarNum() {
        return carNum;
    }

    public String getRiderSeats() {
        return riderSeats;
    }

    public String getCarName() {
        return carName;
    }

    public String getRiderSource() {
        return riderSource;
    }

    public String getRiderDestination() {
        return riderDestination;
    }

    public String getRiderFare() {
        return riderFare;
    }

    public String getDateTime() {
        return dateTime;
    }
}
