package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
        private Context mContext;
        public int[] imageArray = {
                R.drawable.l1,R.drawable.charac,
                R.drawable.chill,R.drawable.down,
                R.drawable.modes,R.drawable.play,
                R.drawable.video,R.drawable.gallery,
                R.drawable.sk,R.drawable.flick,
                R.drawable.bink,R.drawable.zeref,
                R.drawable.ankitta,R.drawable.rebel
        };

        public ImageAdapter(Context mContext) {
                this.mContext = mContext;
        }

        @Override
        public int getCount() {
                return imageArray.length;
        }

        @Override
        public Object getItem(int position) {
                return imageArray[position];
        }

        @Override
        public long getItemId(int position) {
                return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

                ImageView imageView= new ImageView(mContext);
                imageView.setImageResource(imageArray[position]);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(300,280));



                return imageView;
        }
}