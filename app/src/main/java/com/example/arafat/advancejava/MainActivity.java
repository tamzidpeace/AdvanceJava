package com.example.arafat.advancejava;

import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /*try {
            Thread.sleep(3000);
            imageView.animate().alpha(1f).setDuration(4000);
            Log.i(TAG, "onCreate: here-2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/




    }

    public void fade (View view) {
        ImageView imageView = findViewById(R.id.imageView);
        /*imageView.animate().alpha(0f).setDuration(2000);
        //imageView.animate().setStartDelay(5000);
        Log.i(TAG, "onCreate: here-1");

        ImageView imageView1 = findViewById(R.id.imageView2);
        imageView1.animate().alpha(1f).setDuration(5000);*/
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.animate().translationX(-1000f).setDuration(2000);
        }
    }


}
