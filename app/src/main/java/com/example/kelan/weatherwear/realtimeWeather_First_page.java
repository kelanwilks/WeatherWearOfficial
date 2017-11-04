package com.example.kelan.weatherwear;

/**
 * Created by cjthe on 11/4/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class realtimeWeather_First_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtime_weather_first_page);
    }

    public void goToWeather(View v) {
        startActivity(new Intent(this,WeatherWear.class));
    }

    public void goToformal(View v) {
        startActivity(new Intent(this, clothesFormal.class));
    }
}
