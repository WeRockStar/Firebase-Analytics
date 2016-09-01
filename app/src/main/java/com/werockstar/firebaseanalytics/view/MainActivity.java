package com.werockstar.firebaseanalytics.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.werockstar.firebaseanalytics.MainApplication;
import com.werockstar.firebaseanalytics.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    FirebaseAnalytics analytics;

    @BindView(R.id.btnSendEvent)
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((MainApplication) getApplication()).getComponent().inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSendEvent)
    void onSendEvent() {
        analytics.logEvent("EVENT_TEST", null);
    }
}
