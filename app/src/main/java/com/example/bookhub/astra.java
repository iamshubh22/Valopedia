package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class astra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astra);
        setTitle("ASTRA");
        VideoView video1=findViewById(R.id.videoView1);
        VideoView video2=findViewById(R.id.videoView2);
        VideoView video3=findViewById(R.id.videoView3);
        VideoView video4=findViewById(R.id.videoView4);
        video1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.ats);
        video2.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.at);
        video3.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.ast3);
        video4.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.ast4);
        MediaController media1= new MediaController(this);
        MediaController media2= new MediaController(this);
        MediaController media3= new MediaController(this);
        MediaController media4= new MediaController(this);
        media1.setAnchorView(video1);
        media2.setAnchorView(video2);
        media3.setAnchorView(video3);
        media4.setAnchorView(video4);
        video1.setMediaController(media1);
        video2.setMediaController(media2);
        video3.setMediaController(media3);
        video4.setMediaController(media4);
    }
}