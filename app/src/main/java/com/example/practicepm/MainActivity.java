package com.example.practicepm;

import android.content.Intent;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;

import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "200861598", true);
        setContentView(R.layout.activity_main);
    }


    public void open(View view){

        Intent startIntent = new Intent(getApplicationContext(), Main2Activity.class);

        startActivity(startIntent);


    }

    public void opencameron(View view){

        Intent startIntent = new Intent(getApplicationContext(), Main3Activity.class);

        startActivity(startIntent);


    }

    public void openbrown(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityBrown.class);

        startActivity(startIntent);


    }

    public void openblair(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityBlair.class);

        startActivity(startIntent);


    }

    public void openmajor(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityMajor.class);

        startActivity(startIntent);


    }
    public void openthatcher(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityThatcher.class);

        startActivity(startIntent);


    }

    public void opencallagan(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityCallagan.class);

        startActivity(startIntent);


    }

    public void openwilson(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityWilson.class);

        startActivity(startIntent);


    }


    public void openheath(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityHeath.class);

        startActivity(startIntent);


    }

    public void openhome(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityHome.class);

        startActivity(startIntent);


    }

    public void openmacmillian(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityMacmillian.class);

        startActivity(startIntent);


    }

    public void openeden(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityEden.class);

        startActivity(startIntent);


    }

    public void openchurchill(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityChurchill.class);

        startActivity(startIntent);


    }

    public void openattlee(View view){

        Intent startIntent = new Intent(getApplicationContext(), MainActivityAttlee.class);

        startActivity(startIntent);


    }

    public void onBackPressed() {
        super.onBackPressed();
        StartAppAd.onBackPressed(this);
    }

}
