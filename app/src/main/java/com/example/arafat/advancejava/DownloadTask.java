package com.example.arafat.advancejava;

import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadTask extends AsyncTask<String, Void, String> {

    private static final String TAG = "DownloadTask";

    @Override
    protected String doInBackground(String... strings) {

        Log.d(TAG, "doInBackground: " + strings[0]);

        StringBuilder result = new StringBuilder();
        URL url;
        HttpURLConnection urlConnection = null;


        try {

            url = new URL(strings[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            int data = reader.read();

            while (data!= -1) {
                char current = (char) data;
                result.append(current);
                data = reader.read();
            }
            return result.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "done";
    }
}
