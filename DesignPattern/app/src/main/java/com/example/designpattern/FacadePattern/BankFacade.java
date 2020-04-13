package com.example.designpattern.FacadePattern;

import android.util.Log;

import com.example.designpattern.FacadePattern.BankCheck.AccountCheck;
import com.example.designpattern.FacadePattern.BankCheck.FundCheck;
import com.example.designpattern.FacadePattern.BankCheck.SecurityCheck;

public class BankFacade {
    private int accountNum;
    private int securityNum;
    private FundCheck fund = new FundCheck();
    public BankFacade(int account, int security)
    {
        this.accountNum = account;
        this.securityNum = security;
    }

    public boolean isValid()
    {
        AccountCheck accountCheck = new AccountCheck(this.accountNum);
        SecurityCheck securityCheck = new SecurityCheck(this.securityNum);
        return accountCheck.isAccountValid() &&
                securityCheck.isValidSecurity();
    }

    public void accountStatus()
    {
        if (isValid())
        {
            Log.d(MainFacadePattern.FACADETAG, "account log in success");
        }
        Log.d(MainFacadePattern.FACADETAG, "account log in unsuccess");
    }

    public void withdraw(int money)
    {
        this.fund.withdraw(money);
    }

    public double getAccountMoney()
    {
        return this.fund.getCashInAccount();
    }

    public void deposit(int money)
    {
        this.fund.deposit(money);
    }
}
