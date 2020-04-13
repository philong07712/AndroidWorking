package com.example.designpattern.FacadePattern.BankCheck;

import android.util.Log;

import com.example.designpattern.FacadePattern.MainFacadePattern;

public class AccountCheck {
    int account;
    public AccountCheck(int account)
    {
        this.account = account;
    }

    public boolean isAccountValid()
    {
        Log.d(MainFacadePattern.FACADETAG, "Account is Valid");
        return true;
    }
}
