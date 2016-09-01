package com.werockstar.firebaseanalytics.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.werockstar.firebaseanalytics.MainApplication;
import com.werockstar.firebaseanalytics.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    FirebaseAnalytics analytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((MainApplication) getApplication()).getComponent().inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(analytics != null)
            Log.d("Dagger", "Injected");
        else
            Log.d("Dagger", "Not Inject");
    }
}
