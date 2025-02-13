package com.example.resumie;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.resumie.CV.CVFragment;
import com.example.resumie.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();
//        setHomeFragment();
          setCVFragment();
    }

    void setCVFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new CVFragment()).commit();
    }

    void setHomeFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
    }
}