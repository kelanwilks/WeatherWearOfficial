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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class accountSettings extends AppCompatActivity {

    EditText fullname;
    EditText age;
    EditText location;
    EditText gender;


    TextView fullName;
    TextView ae;
    TextView lcation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_main_menu);

        fullname = (EditText) findViewById(R.id.editFirstLastName);
        age = (EditText) findViewById(R.id.editAge);
        location = (EditText) findViewById(R.id.editLocation);
        gender = (EditText) findViewById(R.id.editGender);
        fullName = (TextView) findViewById(R.id.fullNameActual);
        ae = (TextView) findViewById(R.id.ageActual);
        lcation = (TextView) findViewById(R.id.locationActual);

    }

    public void goBack(View v) {
        startActivity(new Intent(this, WeatherWear.class));
    }

    public void saveInfo(View view) {
        SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("fullname", fullname.getText().toString());
        editor.putString("age", age.getText().toString());
        editor.putString("location", location.getText().toString());
        editor.putString("gender", gender.getText().toString());
        editor.commit();
        editor.apply();

        Toast.makeText(this, "Info Saved", Toast.LENGTH_SHORT).show();
        displayData(view);
    }


    public void displayData(View view) {
        SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);

        String name = sharedPref.getString("fullname", "");
        String ag = sharedPref.getString("age", "");
        String lcn = sharedPref.getString("location", "");

        fullName.setText(name);
        ae.setText(ag);
        lcation.setText(lcn);

        startActivity(new Intent(this, WeatherWear.class));

    }



}
