package com.example.designpattern.FacadePattern.BankCheck;

import android.util.Log;

import com.example.designpattern.FacadePattern.MainFacadePattern;

public class SecurityCheck {
    int security;
    public SecurityCheck(int securityNum)
    {
        this.security = securityNum;
    }

    public boolean isValidSecurity()
    {
        if (this.security != 0) {
            Log.d(MainFacadePattern.FACADETAG, "Security is valid");
            return true;
        }
        return false;
    }
}
