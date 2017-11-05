package com.example.kelan.weatherwear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by cjthe on 11/4/2017.
 */

public class clothesCasual extends AppCompatActivity {
    int num = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes_find_casual);
    }

    public void btnSaveLoadout(View v) {

        Button btn = (Button) findViewById(R.id.save);

        Toast.makeText(this, "Outfit Saved!",Toast.LENGTH_LONG).show();
    }

    public void goToWeatherPageBack(View v) {
        startActivity(new Intent(this, WeatherWear.class));
    }

    public void clickbtnRandomize(View v) {
        if (num == 1) {
            ImageView image = (ImageView) findViewById(R.id.casualShirt);
            image.setImageResource(R.drawable.polo_shirt);

            ImageView image1 = (ImageView) findViewById(R.id.casualPants);
            image1.setImageResource(R.drawable.grey_dresspants);

            ImageView image2 = (ImageView) findViewById(R.id.casualBelt);
            image2.setImageResource(R.drawable.amazon_blackbelt);

            ImageView image3 = (ImageView) findViewById(R.id.casualSocks);
            image3.setImageResource(R.drawable.grey_dress_socks);

            ImageView image4 = (ImageView) findViewById(R.id.casualShoes);
            image4.setImageResource(R.drawable.mens_dress_shoes);;

            num = 2;
        }
        else {
            ImageView image = (ImageView) findViewById(R.id.casualShirt);
            image.setImageResource(R.drawable.button_down_and_tie);

            ImageView image1 = (ImageView) findViewById(R.id.casualPants);
            image1.setImageResource(R.drawable.dockers_blackpants);

            ImageView image2 = (ImageView) findViewById(R.id.casualBelt);
            image2.setImageResource(R.drawable.canwelum_brownbelt);

            ImageView image3 = (ImageView) findViewById(R.id.casualSocks);
            image3.setImageResource(R.drawable.argyle_dress_socks);

            ImageView image4 = (ImageView) findViewById(R.id.casualShoes);
            image4.setImageResource(R.drawable.rockport_dressshoe);

            num = 1;
        }
    }

}
