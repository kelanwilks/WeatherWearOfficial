package com.example.kelan.weatherwear;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by cjthe on 11/4/2017.
 */

public class clothesFormal extends AppCompatActivity {
    int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes_find_formal);
    }

    public void goToWeatherPageFromFormal(View v) {
        startActivity(new Intent(this, WeatherWear.class));
    }


    public void clickbtnRandomize(View v) {
        if (num == 1) {
            ImageView image = (ImageView) findViewById(R.id.shirtFormal);
            image.setImageResource(R.drawable.button_down_and_tie);

            ImageView image1 = (ImageView) findViewById(R.id.pantsFormal);
            image1.setImageResource(R.drawable.grey_dresspants);

            ImageView image2 = (ImageView) findViewById(R.id.beltFormal);
            image2.setImageResource(R.drawable.canwelum_brownbelt);

            ImageView image3 = (ImageView) findViewById(R.id.socksFormal);
            image3.setImageResource(R.drawable.grey_dress_socks);

            ImageView image4 = (ImageView) findViewById(R.id.shoesFormal);
            image4.setImageResource(R.drawable.rockport_dressshoe);

            ImageView image5 = (ImageView) findViewById(R.id.jacketFormal);
            image5.setImageResource(R.drawable.black_suit_jacket);

            ImageView image6 = (ImageView) findViewById(R.id.VestFormal);
            image6.setImageResource(R.drawable.grey_vest);

            num = 2;
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.shirtFormal);
            image.setImageResource(R.drawable.shirt_tie);

            ImageView image1 = (ImageView) findViewById(R.id.pantsFormal);
            image1.setImageResource(R.drawable.navy_pants);

            ImageView image2 = (ImageView) findViewById(R.id.beltFormal);
            image2.setImageResource(R.drawable.canwelum_brownbelt);

            ImageView image3 = (ImageView) findViewById(R.id.socksFormal);
            image3.setImageResource(R.drawable.black_socks);

            ImageView image4 = (ImageView) findViewById(R.id.shoesFormal);
            image4.setImageResource(R.drawable.brown_shoe);

            ImageView image5 = (ImageView) findViewById(R.id.jacketFormal);
            image5.setImageResource(R.drawable.grey_sportcoat);

            ImageView image6 = (ImageView) findViewById(R.id.VestFormal);
            image6.setImageResource(R.drawable.black_vest);

            num = 1;
        }
    }
}