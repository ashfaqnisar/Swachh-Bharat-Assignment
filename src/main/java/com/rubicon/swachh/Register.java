package com.rubicon.swachh;

import java.util.Scanner;

public class Register {
    private String mNameText;
    private String mEmailText;
    private String mAddressText;

    private long mPhoneInt;

    private Scanner mScanner = new Scanner(System.in);

    String getmNameText() {
        return mNameText;
    }

    public void setmNameText(String mNameText) {
        this.mNameText = mNameText;
    }

    public String getmEmailText() {
        return mEmailText;
    }

    public void setmEmailText(String mEmailText) {
        this.mEmailText = mEmailText;
    }

    public String getmAddressText() {
        return mAddressText;
    }

    public void setmAddressText(String mAddressText) {
        this.mAddressText = mAddressText;
    }

    public long getmPhoneInt() {
        return mPhoneInt;
    }

    public void setmPhoneInt(int mPhoneInt) {
        this.mPhoneInt = mPhoneInt;
    }

    void generateRegistrationForm() {
        System.out.println("Registration: ");
        System.out.print("Hello There, Please provide your name: ");
        mNameText = mScanner.nextLine();

        System.out.print("\n\n");

        System.out.print("Hi " + mNameText + ", can you please provide your email address: ");
        mEmailText = mScanner.nextLine();
        System.out.print("Don't Worry, we are not going to spam you");

        System.out.print("\n\n");

        System.out.print("Hey " + mNameText + ", please provide your number: ");
        mPhoneInt = mScanner.nextLong();

        System.out.print("\n\n");

        System.out.print("Hey " + mNameText + ", can you provide your address: ");
        mAddressText = mScanner.nextLine();

        System.out.print("\n\n");

    }
}
