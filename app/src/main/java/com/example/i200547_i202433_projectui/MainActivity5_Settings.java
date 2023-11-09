package com.example.i200547_i202433_projectui;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5_Settings extends AppCompatActivity {

    LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_5_settings);

        linearLayout1 = findViewById(R.id.e8);
        linearLayout2 = findViewById(R.id.e12);
        linearLayout3 = findViewById(R.id.e16);
        linearLayout4 = findViewById(R.id.e20);
        linearLayout5 = findViewById(R.id.e25);
        linearLayout6 = findViewById(R.id.e29);
        linearLayout7 = findViewById(R.id.e34);
        linearLayout8 = findViewById(R.id.e38);
        linearLayout9 = findViewById(R.id.e42);


        linearLayout1.getBackground().setAlpha(120);
        linearLayout2.getBackground().setAlpha(120);
        linearLayout3.getBackground().setAlpha(120);
        linearLayout4.getBackground().setAlpha(120);
        linearLayout5.getBackground().setAlpha(120);
        linearLayout6.getBackground().setAlpha(120);
        linearLayout7.getBackground().setAlpha(120);
        linearLayout8.getBackground().setAlpha(120);
        linearLayout9.getBackground().setAlpha(120);
    }
}