package com.example.arafat.advancejava;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    ImageView imageView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

    }

    public void downloadImage(View view) {
        Log.d(TAG, "downloadImage: called");
        // https://www.sideshow.com/storage/product-images/903421/iron-man_marvel_gallery_5c4cced10da7f.jpg
        DownloadTask downloadTask = new DownloadTask();
        Bitmap mImage;

        try {
            mImage = downloadTask.execute("https://www.sideshow.com/storage/product-images/903421/iron-man_marvel_gallery_5c4cced10da7f.jpg").get();
            imageView.setImageBitmap(mImage);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

