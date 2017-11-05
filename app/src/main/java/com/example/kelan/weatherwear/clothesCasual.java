package com.example.kelan.weatherwear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by cjthe on 11/4/2017.
 */

public class clothesCasual extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes_find_casual);
    }

    public void goToWeatherPageBack(View v) {
        startActivity(new Intent(this, WeatherWear.class));
    }


}
