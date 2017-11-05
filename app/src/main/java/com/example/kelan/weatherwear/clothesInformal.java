package com.example.kelan.weatherwear;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

/**
 * Created by cjthe on 11/4/2017.
 */

public class clothesInformal extends AppCompatActivity {
    int num = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes_find_informal);
    }

    public void goToWeatherPage(View v) {
        startActivity(new Intent(this, realtimeWeather_First_page.class));
    }

    public void clickbtnRandomize(View v) {
        if(num == 1) {
            ImageView image = (ImageView) findViewById(R.id.shirt);
            image.setImageResource(R.drawable.walmart_longsleeve_shirt);

            ImageView image1 = (ImageView) findViewById(R.id.pants);
            image1.setImageResource(R.drawable.mountainkhakies_tan);

            ImageView image2 = (ImageView) findViewById(R.id.belt);
            image2.setImageResource(R.drawable.khols_blackbelt);

            ImageView image3 = (ImageView) findViewById(R.id.socks);
            image3.setImageResource(R.drawable.lyst_brownsock);

            ImageView image4 = (ImageView) findViewById(R.id.shoes);
            image4.setImageResource(R.drawable.alexpress_shoes);

            num++;
        }

        else {
            ImageView image = (ImageView) findViewById(R.id.shirt);
            image.setImageResource(R.drawable.deluthtrading_redshirt);

            ImageView image1 = (ImageView) findViewById(R.id.pants);
            image1.setImageResource(R.drawable.hm_jeans);

            ImageView image2 = (ImageView) findViewById(R.id.belt);
            image2.setImageResource(R.drawable.canwelum_brownbelt);

            ImageView image3 = (ImageView) findViewById(R.id.socks);
            image3.setImageResource(R.drawable.dickies_blacksocks);

            ImageView image4 = (ImageView) findViewById(R.id.shoes);
            image4.setImageResource(R.drawable.dsw_boot);
            num--;
        }





    }

}