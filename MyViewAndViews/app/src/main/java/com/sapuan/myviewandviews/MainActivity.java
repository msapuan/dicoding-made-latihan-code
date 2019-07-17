package com.sapuan.myviewandviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ganti teks judul pada Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Google Pixel");
        }

    }
}
