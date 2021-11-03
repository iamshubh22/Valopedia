package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class social extends AppCompatActivity implements View.OnClickListener {

    ImageView fb,insta,linked,git;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        setTitle("Developers Profile");

        fb = findViewById(R.id.fb);
        fb.setOnClickListener(this);
        insta = findViewById(R.id.insta);
        insta.setOnClickListener(this);
        git = findViewById(R.id.git);
        git.setOnClickListener(this);
        linked = findViewById(R.id.linked);
        linked.setOnClickListener(this);

     }

     private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fb:
                gotoUrl("https://www.facebook.com/profile.php?id=100008846258363");
                break;
            case R.id.insta:
                gotoUrl("https://www.instagram.com/ig_demon_22/");
                break;
            case R.id.git:
                gotoUrl("https://github.com/iamshubh22");
                break;
            case R.id.linked:
                gotoUrl("https://www.linkedin.com/in/shubh-dwivedi-4653b2176/");
                break;
            default:
                break;
        }

    }
}