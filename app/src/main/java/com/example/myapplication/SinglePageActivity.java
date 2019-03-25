package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class SinglePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_page);
        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        Bundle extras = getIntent().getExtras();
//        byte[] byteArray = extras.getByteArray("IMAGE");
//
//        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        imageView.setImageResource(extras.getInt("IMAGE"));


    }
}
