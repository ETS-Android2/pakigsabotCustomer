package com.example.pakigsabot.InternetCafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pakigsabot.R;

public class InternetCafeSelectTime extends AppCompatActivity {

    Button am89BtnICafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_cafe_select_time);

        refs();

        am89BtnICafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                internetCafeReservationDetails();
            }
        });
    }

    public void refs(){
        am89BtnICafe = findViewById(R.id.am89BtnICafe);
    }

    private void internetCafeReservationDetails(){
        Intent intent = new Intent(getApplicationContext(), InternetCafeRDetails.class);
        startActivity(intent);
    }
}