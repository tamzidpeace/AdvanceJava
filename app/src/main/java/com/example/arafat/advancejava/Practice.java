package com.example.arafat.advancejava;

import android.os.CountDownTimer;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Practice {

    private static final String TAG = "Practice";

    public static void main(String[] args) {

        /*List number = new ArrayList();
        number.add(1);
        number.add(2);
        number.add("arafat");
        Iterator iterator = number.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        Map personInfo = new HashMap();
        personInfo.put("name", "arafat");
        personInfo.put(2, 34);

        System.out.println(personInfo.get(2));



    }
}
