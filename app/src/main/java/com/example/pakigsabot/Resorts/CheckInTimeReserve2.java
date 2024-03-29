package com.example.pakigsabot.Resorts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pakigsabot.R;

public class CheckInTimeReserve2 extends AppCompatActivity {

    Button okBtnCheckInTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_time_reserve2);

        refs();

        okBtnCheckInTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reservationDetails();
            }
        });
    }

    public void refs(){
        okBtnCheckInTime = findViewById(R.id.okBtnCheckInTime);
    }

    private void reservationDetails(){
        Intent intent = new Intent(getApplicationContext(), ResortReservationDetails.class);
        startActivity(intent);
    }
}