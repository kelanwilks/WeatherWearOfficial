package com.example.kelan.weatherwear;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

/**
 * Created by cjthe on 11/4/2017.
 */

public class clothesInformal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes_find_informal);
    }

    private void createRadioButtons() {
        RadioGroup group = (RadioGroup) findViewById(R.id.typeClothesTest);

        RadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(clothesInformal.this, "You Clicked", Toast.LENGTH_SHORT)
                        .show();
            }
        })

    }

}