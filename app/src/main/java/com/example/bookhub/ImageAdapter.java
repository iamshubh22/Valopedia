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
                R.drawable.g1,R.drawable.g2,R.drawable.g3,R.drawable.g4,R.drawable.g5,R.drawable.g6,R.drawable.g7,
                R.drawable.g8,R.drawable.g9,R.drawable.g10,R.drawable.g11, R.drawable.g12,R.drawable.g13,R.drawable.g14,
                R.drawable.g15,R.drawable.g16,R.drawable.g17,R.drawable.g18,R.drawable.g19,R.drawable.g20, R.drawable.g21,
                R.drawable.g22,R.drawable.g23,R.drawable.g24,R.drawable.g25,R.drawable.g26,R.drawable.g27,R.drawable.g28,
                R.drawable.g29, R.drawable.g30,R.drawable.g31,R.drawable.g32,R.drawable.g33,R.drawable.g34,R.drawable.g35,
                R.drawable.g36,
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