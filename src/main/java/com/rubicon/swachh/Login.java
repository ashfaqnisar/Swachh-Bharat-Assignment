package com.rubicon.swachh;

import java.util.Scanner;

public class Login {
    private String mEmailText;
    private long mPhoneText;
    private Scanner mScanner = new Scanner(System.in);

    public String getmEmailText() {
        return mEmailText;
    }

    public void setmEmailText(String mEmailText) {
        this.mEmailText = mEmailText;
    }

    public long getmPhoneText() {
        return mPhoneText;
    }

    public void setmPhoneText(long mPhoneText) {
        this.mPhoneText = mPhoneText;
    }

    public void generateLoginForm() {
        System.out.print("Login \n");

        System.out.print("Hello there, can you provide your email id: ");
        mEmailText = mScanner.nextLine();

        System.out.print("\n\n");

        System.out.print("Thank you, please provide the number: ");
        mPhoneText = mScanner.nextLong();
    }
}
