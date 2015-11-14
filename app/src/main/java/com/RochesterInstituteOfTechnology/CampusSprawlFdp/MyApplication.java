package com.RochesterInstituteOfTechnology.CampusSprawlFdp;

import android.app.Application;

import com.estimote.sdk.EstimoteSDK;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "campus-sprawl-fdp", "bd60b118389d4a5885f5a39ffff83c8c");

        // uncomment to enable debug-level logging
        // it's usually only a good idea when troubleshooting issues with the Estimote SDK
//        EstimoteSDK.enableDebugLogging(true);
    }
}
