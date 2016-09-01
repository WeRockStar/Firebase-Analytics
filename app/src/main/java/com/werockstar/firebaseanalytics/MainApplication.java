package com.werockstar.firebaseanalytics;


import android.app.Application;

import com.werockstar.firebaseanalytics.di.AndroidComponent;
import com.werockstar.firebaseanalytics.di.AndroidModule;
import com.werockstar.firebaseanalytics.di.DaggerAndroidComponent;

public class MainApplication extends Application {

    AndroidComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAndroidComponent.builder().androidModule(new AndroidModule(this)).build();
    }

    public AndroidComponent getComponent() {
        return component;
    }
}
