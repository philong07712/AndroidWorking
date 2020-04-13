package com.example.designpattern.AdapterPattern;

public class KillerAdapter implements IEnemyRobot{
    EnemyKiller boss;
    public KillerAdapter(EnemyKiller killer)
    {
        this.boss = killer;
    }
    @Override
    public void attack() {
        boss.smashHand();
    }

    @Override
    public void moving() {
        boss.FlyForward();
    }
}
