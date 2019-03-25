package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {

    //LIBRARY USED  : https://github.com/sayyam/carouselview
    //REFERENCE IMPLEMENTATION : https://www.androidhive.info/2016/05/android-working-with-card-view-and-recycler-view/

    CarouselView carouselView;
  //  int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};
    ArrayList<Integer> array_image = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        array_image.add(R.drawable.image_1);
        array_image.add(R.drawable.image_2);
        array_image.add(R.drawable.image_3);
        array_image.add(R.drawable.image_4);
        array_image.add(R.drawable.image_5);
        array_image.add(R.drawable.image_1);
        array_image.add(R.drawable.image_2);
        array_image.add(R.drawable.image_3);
        array_image.add(R.drawable.image_4);
        array_image.add(R.drawable.image_5);
        carouselView = (CarouselView) findViewById(R.id.carouselView);
        Button LogOutButton = (Button) findViewById(R.id.buttonLogOut);
        LogOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
        carouselView.setPageCount(array_image.size());
      //  carouselView.setSlideInterval(5);
        carouselView.setImageListener(imageListener);


       RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
       AdapterRecyclerView adapter = new AdapterRecyclerView(this, array_image);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
   //     recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(array_image.get(position));
        }
    };
}


