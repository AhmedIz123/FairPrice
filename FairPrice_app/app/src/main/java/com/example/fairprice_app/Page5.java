package com.example.fairprice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Page5 extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        ImageView imageView = findViewById(R.id.product);
        ProgressBar loader = findViewById(R.id.loader);
        loader.setProgressTintList(getResources().getColorStateList(R.color.purple));
        Bitmap imageBitmap = getIntent().getParcelableExtra("image");
        if (imageBitmap != null) {
            imageView.setImageBitmap(imageBitmap);
        }
    }
}