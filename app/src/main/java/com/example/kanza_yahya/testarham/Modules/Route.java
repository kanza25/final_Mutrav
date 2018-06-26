package com.example.kanza_yahya.testarham.Modules;

/**
 * Created by KaNza_Yahya on 13/06/2018.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class Route {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
