package com.example.kelan.weatherwear;

import android.content.Intent;
import android.net.Uri;
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

public class savedOutfits extends AppCompatActivity {
    int num = 1;
    int weather = 70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothes_find_informal);
        //weather = (int) setContentView(R.layout.weather);
    }

    public void goToWeatherPage(View v) {
        startActivity(new Intent(this, realtimeWeather_First_page.class));
    }

    public void clickbtnRandomize(View v) {
        if(weather >= 70) {
            if (num == 1) {
                ImageView image = (ImageView) findViewById(R.id.shirt);
                image.setImageResource(R.drawable.oldnavy_shirt);

                ImageView image1 = (ImageView) findViewById(R.id.pants);
                image1.setImageResource(R.drawable.oldnavy_shorts);

                ImageView image2 = (ImageView) findViewById(R.id.belt);
                image2.setImageResource(R.drawable.amazonbelt);

                ImageView image3 = (ImageView) findViewById(R.id.socks);
                image3.setImageResource(R.drawable.nike_blacksocks);

                ImageView image4 = (ImageView) findViewById(R.id.shoes);
                image4.setImageResource(R.drawable.converseblackshoes);

                num = 2;
            }
            else {
                ImageView image = (ImageView) findViewById(R.id.shirt);
                image.setImageResource(R.drawable.macys_blueshirt);

                ImageView image1 = (ImageView) findViewById(R.id.pants);
                image1.setImageResource(R.drawable.patagonia_shorts);

                ImageView image2 = (ImageView) findViewById(R.id.belt);
                image2.setImageResource(R.drawable.khols_blackbelt);

                ImageView image3 = (ImageView) findViewById(R.id.socks);
                image3.setImageResource(R.drawable.no_socks_image);

                ImageView image4 = (ImageView) findViewById(R.id.shoes);
                image4.setImageResource(R.drawable.sperry_shoes);

                num = 1;
            }
        }
        else {
            if (num == 1) {
                ImageView image = (ImageView) findViewById(R.id.shirt);
                image.setImageResource(R.drawable.walmart_longsleeve_shirt);

                ImageView image1 = (ImageView) findViewById(R.id.pants);
                image1.setImageResource(R.drawable.mountainkhackies_tan);

                ImageView image2 = (ImageView) findViewById(R.id.belt);
                image2.setImageResource(R.drawable.khols_blackbelt);

                ImageView image3 = (ImageView) findViewById(R.id.socks);
                image3.setImageResource(R.drawable.lyst_brownsock);

                ImageView image4 = (ImageView) findViewById(R.id.shoes);
                image4.setImageResource(R.drawable.alexpress_shoes);

                num = 2;
            } else {
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
                num = 1;
            }
        }

    }
    public void btnSaveLoadout(View v) {

        Button btn = (Button) findViewById(R.id.save);

        Toast.makeText(this, "Outfit Saved!",Toast.LENGTH_LONG).show();
    }

    public void hyperLinkOnClickshirt(View v) {
        if(weather >= 70) {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.macys.com/shop/product/tommy-hilfiger-mens-classic-fit-ivy-polo?ID=5005529&CategoryID=20626&swatchColor=Medium%20Grey%20Heather#fn=sp%3D1%26spc%3D5435%26ruleId%3D78%7CBOOST%20SAVED%20SET%7CBOOST%20ATTRIBUTE%26searchPass%3DmatchNone%26slotId%3D16"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.polyvore.com/old_navy_mens_marled_henley/thing?id=77058922"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }
        else {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.duluthtrading.com/store/product/mens-free-swingin-flannel-shirt-52007.aspx?wpc=FBD&tall=N&src=GPSHPMN&gclid=Cj0KCQjwyvXPBRD-ARIsAIeQeoH3sloOclq6klWjTD4xLI5XCfTqjb6oWUWM4r2K3Qdv4YYc5jEgnvQaAn3TEALw_wcB"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.google.com/search?rlz=1C1CHZL_enUS704US704&biw=1419&bih=925&tbm=isch&sa=1&ei=nDv-WdCkDsKwjwT1sqiYBQ&q=long+sleeve+shirt+men&oq=long+sleeve+shirt+men&gs_l=psy-ab.3...1672.1672.0.2636.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.O_nkDJ-tvEI#imgrc=FSXp1mWzgxgbWM:"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }

    }
    public void hyperLinkOnClickpants(View v) {
        if(weather >= 70) {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.aliexpress.com/store/product/2015-Fashion-Men-Winter-Shoes-Lace-up-Ankle-Boots-Warm-Cotton-Inside-Street-Motorcycle-Boots-XMX258/915005_32392455022.html"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("http://oldnavy.gap.com/browse/search.do?searchText=mens+shorts"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }
        else {
            if(num == 1) {
                Uri uri = Uri.parse("http://www.hm.com/us/product/70069?article=70069-B"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.mountainkhakis.com/products/mens/bottoms/pants/men-s-original-mountain-pant"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }

    }
    public void hyperLinkOnClickshoes(View v) {
        if(weather >= 70) {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.amazon.com/Sperry-Top-Sider-Mens-Boat-Shoe/dp/B018PEMRXA"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.footlocker.com/Mens/Converse/_-_/N-24Z108"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }
        else {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.dsw.com/en/us/product/aldo-avellino-boot/400261?activeColor=240"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.aliexpress.com/store/product/2015-Fashion-Men-Winter-Shoes-Lace-up-Ankle-Boots-Warm-Cotton-Inside-Street-Motorcycle-Boots-XMX258/915005_32392455022.html"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }

    }
    public void hyperLinkOnClicksocks(View v) {
        if(weather >= 70) {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.google.com/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.amazon.co.uk/black-cotton-cushioned-sport-socks/dp/B00526QOM0"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }
        else {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.lyst.com/clothing/blackcouk-mens-light-brown-cashmere-socks/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.lyst.com/clothing/blackcouk-mens-light-brown-cashmere-socks/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }

    }
    public void hyperLinkOnClickbelt(View v) {
        if(weather >= 70) {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.google.com/search?rlz=1C1CHZL_enUS704US704&biw=1419&bih=864&tbm=isch&sa=1&ei=Dzz-WbuFJOrTjwSei6_4CA&q=mens+belt+black&oq=mens+belt+black&gs_l=psy-ab.3...1414.5030.0.5409.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.zHDYeWvObJI#imgrc=NPHdIwNzHjz1nM:"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.amazon.com/Fossil-MB1252609-Mens-Joe-Belt/dp/B00HVVR0B8"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }
        else {
            if(num == 1) {
                Uri uri = Uri.parse("https://www.google.com/search?rlz=1C1CHZL_enUS704US704&biw=1419&bih=864&tbm=isch&sa=1&ei=Dzz-WbuFJOrTjwSei6_4CA&q=mens+belt+black&oq=mens+belt+black&gs_l=psy-ab.3...1414.5030.0.5409.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.zHDYeWvObJI#imgrc=NPHdIwNzHjz1nM:"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
            else {
                Uri uri = Uri.parse("https://www.google.com/search?rlz=1C1CHZL_enUS704US704&biw=1419&bih=864&tbm=isch&sa=1&ei=Dzz-WbuFJOrTjwSei6_4CA&q=mens+belt+black&oq=mens+belt+black&gs_l=psy-ab.3...1414.5030.0.5409.0.0.0.0.0.0.0.0..0.0....0...1.1.64.psy-ab..0.0.0....0.zHDYeWvObJI#imgrc=NPHdIwNzHjz1nM:"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        }

    }

}