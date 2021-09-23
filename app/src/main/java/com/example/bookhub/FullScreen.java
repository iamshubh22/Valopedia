package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreen extends AppCompatActivity {

    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        image1=findViewById(R.id.image1);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("FULL IMAGE");

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");

        ImageAdapter imageAdapter = new ImageAdapter(this);

        image1.setImageResource(imageAdapter.imageArray[position]);


    }
}