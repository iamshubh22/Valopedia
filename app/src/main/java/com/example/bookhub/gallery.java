package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class gallery extends AppCompatActivity {

    GridView gall1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        setTitle("Valopedia->Gallery");

        gall1=findViewById(R.id.gall1);

        gall1.setAdapter(new ImageAdapter(this));

        gall1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),FullScreen.class);
                intent.putExtra("id",position);
                startActivity(intent);
            }
        });


    }
}