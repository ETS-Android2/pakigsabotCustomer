package com.example.pakigsabot.Chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pakigsabot.R;
public class ChatbotConversation3 extends AppCompatActivity {

    TextView homeMenuTxt2CC3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot_conversation3);

        refs();

        homeMenuTxt2CC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chatbotConversation4();
            }
        });
    }

    public void refs(){
        homeMenuTxt2CC3 = findViewById(R.id.homeMenuTxt2CC3);
    }

    private void chatbotConversation4(){
        Intent intent = new Intent(getApplicationContext(), ChatbotConversation4.class);
        startActivity(intent);
    }
}