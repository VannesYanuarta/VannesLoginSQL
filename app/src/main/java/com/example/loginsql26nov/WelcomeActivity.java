package com.example.loginsql26nov;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView welcomeMessage = findViewById(R.id.welcomeMessage);

        // Mendapatkan username yang dikirimkan dari LoginActivity
        String username = getIntent().getStringExtra("USERNAME");

        // Menampilkan pesan selamat datang
        welcomeMessage.setText("Selamat Datang, " + username);
    }
}
