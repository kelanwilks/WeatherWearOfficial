package com.example.kelan.weatherwear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import static android.support.v7.appcompat.R.styleable.View;

public class WeatherWear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_wear);
    }

    public void goToWeatherPage(View v) {
        setContentView(R.layout.activity_realtime_weather_first_page);
    }

    public void goToBackPage(View v) {
        setContentView(R.layout.activity_realtime_weather_first_page);
    }
}
