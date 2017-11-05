package com.example.kelan.weatherwear;

/**
 * Created by cjthe on 11/4/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class realtimeWeather_First_page extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    int idForButtonReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtime_weather_first_page);
        rg = (RadioGroup) findViewById(R.id.typeClothesTest);
    }

    public void radioOnClick(View v) {
        int radioButtonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radioButtonid);

        idForButtonReturn = rb.getId();
        //if(idForButtonReturn == "asdf") {

        //}

        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_LONG).show();
    }

    public void goToWeather(View v) {
        startActivity(new Intent(this,WeatherWear.class));
    }

    public void goToformal(View v) {
        startActivity(new Intent(this, clothesInformal.class));
    }
}
