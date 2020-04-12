package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpattern.AbstractFactoryPattern.MainAbstractFactoryPattern;
import com.example.designpattern.DecoratePattern.MainDecoratePattern;
import com.example.designpattern.FactoryPattern.MainFactoryPattern;
import com.example.designpattern.ObserverPattern.MainObserverPattern;
import com.example.designpattern.ObserverPattern.Observerable.Observerable;
import com.example.designpattern.SingletonPattern.MainSingletonPattern;
import com.example.designpattern.SingletonPattern.SingletonClass;
import com.example.designpattern.StrategyPattern.MainStrategyPattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // using variable for experiment purpose
        IPattern pattern = new MainSingletonPattern();
        pattern.run();
    }
}
