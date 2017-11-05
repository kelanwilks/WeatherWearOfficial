package com.example.kelan.weatherwear;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by cjthe on 11/4/2017.
 */

public class clothesFormal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes_find_formal);
    }

    public void goToWeatherPageFromFormal(View v) {
        startActivity(new Intent(this, realtimeWeather_First_page.class));
    }

    public void btnSaveLoadoutFormal(View v) {

        Button btn = (Button) findViewById(R.id.save);

        Toast.makeText(this, "Outfit Saved!",Toast.LENGTH_LONG).show();
    }
}
