package com.example.designpattern.FacadePattern;

import android.util.Log;

import com.example.designpattern.IPattern;

public class MainFacadePattern implements IPattern {
    public static final String FACADETAG = "FacadePattern";
    @Override
    public void run() {
        BankFacade bank = new BankFacade(12345678,1234);
        bank.deposit(1000);
        bank.withdraw(30);
        bank.withdraw(900);
        Log.d(FACADETAG, Double.toString(bank.getAccountMoney()));
    }
}
