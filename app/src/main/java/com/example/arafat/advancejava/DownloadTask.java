package com.example.arafat.advancejava;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadTask extends AsyncTask<String, Void, Bitmap> {

    private static final String TAG = "DownloadTask";

    @Override
    protected Bitmap doInBackground(String... strings) {

        Log.d(TAG, "doInBackground: " + strings[0]);

        StringBuilder result = new StringBuilder();
        URL url;
        HttpURLConnection urlConnection = null;

        try {

            url = new URL(strings[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            InputStream inputStream = urlConnection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);

            return myBitmap;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
