package com.kamal.c0777682_w2020_mad3125_midterm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PersonInfoActivity extends AppCompatActivity {

    private static final String TAG = PersonInfoActivity.class.getSimpleName();
    int x = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Person Information Form");

    }

        @Override
        public void onConfigurationChanged(@NonNull Configuration newConfig)
        {
            super.onConfigurationChanged(newConfig);

            if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            {
                Log.d(TAG, "ORIENTATION_LANDSCAPE " + x );
            }else
            {
                Log.d(TAG, "ORIENTATION_PORTRAIT " + x);
            }
        }
    }

