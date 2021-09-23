package com.example.bookhub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class rossi extends AppCompatActivity {
    private Button back_btn;
    private Button btnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rossi);
        setTitle("Valopedia->SK ROSSI PAGE");



        YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view2);
        getLifecycle().addObserver(youTubePlayerView1);

        youTubePlayerView1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "R9yfip3Zu7o";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view3);
        getLifecycle().addObserver(youTubePlayerView2);

        youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "0VF-9AE_Q5g";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view4);
        getLifecycle().addObserver(youTubePlayerView3);

        youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "BCXkDOuYZ-c";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView4 = findViewById(R.id.youtube_player_view5);
        getLifecycle().addObserver(youTubePlayerView4);

        youTubePlayerView4.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "4FyGUG1S0Cs";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView5 = findViewById(R.id.youtube_player_view6);
        getLifecycle().addObserver(youTubePlayerView5);

        youTubePlayerView5.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "MFxzXtu2HCc";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        YouTubePlayerView youTubePlayerView6 = findViewById(R.id.youtube_player_view7);
        getLifecycle().addObserver(youTubePlayerView6);

        youTubePlayerView6.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "KFESU7BHVNc";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });


        back_btn = (Button) findViewById(R.id.back_btn);
        btnlog = (Button) findViewById(R.id.btnlog);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PAGE_FIRST();
            }
        });

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LOGIN();
            }
        });


    }



    public void PAGE_FIRST(){
        Intent intent= new Intent(this,PAGE_FIRST.class);
        startActivity(intent);
        Toast.makeText(rossi.this,"WELCOME BACK TO HOME PAGE",Toast.LENGTH_SHORT).show();
    }

    public void LOGIN(){
        Intent intent= new Intent(this,LOGIN.class);
        startActivity(intent);
        Toast.makeText(rossi.this,
                "HAVE A GOOD DAY",
                Toast.LENGTH_SHORT).show();
    }


}