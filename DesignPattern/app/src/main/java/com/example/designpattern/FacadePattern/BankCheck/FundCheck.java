package com.example.designpattern.FacadePattern.BankCheck;

import android.util.Log;

import com.example.designpattern.FacadePattern.MainFacadePattern;
import com.example.designpattern.StrategyPattern.MainStrategyPattern;

import java.util.regex.Pattern;

public class FundCheck {
    private double cashInAccount = 1000;

    public boolean canWithdraw(int money)
    {
        if (this.cashInAccount < money)
        {
            Log.d(MainFacadePattern.FACADETAG, "Too low money to withdraw");
            return false;
        }
        Log.d(MainFacadePattern.FACADETAG, "Withdraw complete");
        return true;
    }

    public void withdraw(int money)
    {
       if (canWithdraw(money))
       {
           this.cashInAccount -= money;
       }
    }

    public void deposit(int money)
    {
        this.cashInAccount += money;
        Log.d(MainFacadePattern.FACADETAG, "Deposit success");
    }

    public double getCashInAccount()
    {
        return this.cashInAccount;
    }
}
