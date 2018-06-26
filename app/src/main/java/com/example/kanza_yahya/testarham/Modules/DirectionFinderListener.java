package com.example.kanza_yahya.testarham.Modules;

/**
 * Created by KaNza_Yahya on 13/06/2018.
 */

import java.util.List;

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}

