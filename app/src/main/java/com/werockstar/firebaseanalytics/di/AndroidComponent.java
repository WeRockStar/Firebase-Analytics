package com.werockstar.firebaseanalytics.di;

import android.app.Activity;

import com.werockstar.firebaseanalytics.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AndroidModule.class)
public interface AndroidComponent {
    void inject(MainActivity activity);
}
