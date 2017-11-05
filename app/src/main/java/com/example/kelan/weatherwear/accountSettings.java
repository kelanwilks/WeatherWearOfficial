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
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class accountSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_main_menu);
    }

    public void goBack(View v) {
        startActivity(new Intent(this, WeatherWear.class));}

    public void btnSaveLoadoutmenu(View v) {

        Button btn = (Button) findViewById(R.id.save);

        Toast.makeText(this, "Outfit Saved!",Toast.LENGTH_LONG).show();
    }


}
