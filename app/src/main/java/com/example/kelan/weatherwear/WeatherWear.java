package com.example.kelan.weatherwear;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.support.v7.appcompat.R.styleable.View;

public class WeatherWear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_wear);
    }

    public void goToWeatherPage(View v) {
        startActivity(new Intent(this,realtimeWeather_First_page.class));
    }

    public void goToAccount(View v) {
        startActivity(new Intent(this,accountSettings.class));
    }

    public void goToOutfits(View v) {
        startActivity(new Intent(this,savedOutfits.class));
    }

    public void goToCalendar(View v){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.calendar");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        }
    }

}
