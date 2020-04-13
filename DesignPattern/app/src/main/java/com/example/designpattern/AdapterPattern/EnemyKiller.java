package com.example.designpattern.AdapterPattern;

import android.util.Log;

import java.util.Random;

public class EnemyKiller {
    Random generate = new Random();
    public void smashHand()
    {
        Log.d(MainAdapterPattern.TAG, "This boss has deal " + generate.nextInt(100) +
                " Damages");
    }

    public void FlyForward()
    {
        Log.d(MainAdapterPattern.TAG, "This boss has fly " + generate.nextInt(30) +
                " steps");
    }

}
