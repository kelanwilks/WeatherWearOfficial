package com.example.kelan.weatherwear;

/**
 * Created by cjthe on 11/4/2017.
 */
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class realtimeWeather_First_page extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    RadioButton temp;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtime_weather_first_page);
        rg = (RadioGroup) findViewById(R.id.typeClothesTest);
        temp = (RadioButton) findViewById(R.id.informal);

        String city = "State College";
        String state = "PA";

        WebView myWebViewC = (WebView) findViewById(R.id.weatherCurrent);
        myWebViewC.loadUrl("http://weathersticker.wunderground.com/weathersticker/cgi-bin/banner/ban/wxBanner?bannertype=wu_clean2day_cond&airportcode=KUNV&ForcedCity="+city+"&ForcedState="+state+"&zip=16801&language=EN\"");

    }

    public void radioOnClick(View v) {
        int radioButtonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radioButtonid);

        if(rb.getText().charAt(0) == 'F') {
            i = 1;
        }
        else if(rb.getText().charAt(0) == 'I') {
            i = 2;
        }
        else if(rb.getText().charAt(0) == 'B') {
            i = 3;
        }
        Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_SHORT).show();
    }

    public void goToInformal(View v) {

        if(i == 1) {
            startActivity(new Intent(this, clothesFormal.class));
        }
        else if(i == 2) {
            startActivity(new Intent(this, clothesInformal.class));
        }
        else if(i == 3) {
            startActivity(new Intent(this, clothesCasual.class));
        }
    }

    public void goToWeather(View v) {
        startActivity(new Intent(this,WeatherWear.class));
    }
}
