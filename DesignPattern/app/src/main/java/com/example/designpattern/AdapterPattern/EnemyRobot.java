package com.example.designpattern.AdapterPattern;

import android.util.Log;

import java.util.Random;

public class EnemyRobot implements IEnemyRobot
{
    private String driver;
    Random generate = new Random();
    @Override
    public void attack() {
        Log.d(MainAdapterPattern.TAG, "this robot deal " + generate.nextInt(10) +
                " Damages");
    }

    @Override
    public void moving() {
        Log.d(MainAdapterPattern.TAG, "this robot moving " + generate.nextInt(10) +
                " Meters");
    }

    public void setDriver(String driver)
    {
        this.driver = driver;
    }
}
