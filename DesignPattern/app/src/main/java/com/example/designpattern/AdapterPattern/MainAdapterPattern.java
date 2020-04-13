package com.example.designpattern.AdapterPattern;

import com.example.designpattern.IPattern;

public class MainAdapterPattern implements IPattern {
    public static final String TAG = "AdapterPattern";
    @Override
    public void run() {
        IEnemyRobot soldier = new EnemyRobot();
        IEnemyRobot boss = new KillerAdapter(new EnemyKiller());

        soldier.attack();
        boss.attack();

        soldier.moving();
        boss.moving();
    }
}
