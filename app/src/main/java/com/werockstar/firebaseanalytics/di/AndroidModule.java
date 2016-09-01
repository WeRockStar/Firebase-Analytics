package com.werockstar.firebaseanalytics.di;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidModule {

    private Activity activity;

    public AndroidModule(Activity activity) {
        this.activity = activity;
    }

}
