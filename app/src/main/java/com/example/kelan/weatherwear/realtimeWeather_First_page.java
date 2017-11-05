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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class realtimeWeather_First_page extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    TextView tv;
    String idtemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtime_weather_first_page);
        rg = (RadioGroup) findViewById(R.id.typeClothesTest);
    }

    public void radioOnClick(View v) {
        int radioButtonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radioButtonid);
      //  idtemp = rb.toString();
       // tv.setText(idtemp);

        Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_SHORT).show();
    }

    public void goToInformal(View v) {
        startActivity(new Intent(this, clothesInformal.class));
       // if(rb.getId() == "Formal"){
      //      startActivity(new Intent(this, clothesFormal.class));
      //  }
      //  else if(rb.getText() == "Informal") {
       //     startActivity(new Intent(this, clothesInformal.class));
       // }
       // else if(rb.getText() == "Business Casual") {
     //       startActivity(new Intent(this, clothesCasual.class));
      //  }
    }

    public void goToWeather(View v) {
        startActivity(new Intent(this,WeatherWear.class));
    }
}
