package com.rubicon.swachh;

public class App 
{
    public static void main(String[] args)
    {


        Register mRegister = new Register();
        mRegister.generateRegistrationForm();
        System.out.println(mRegister.getmNameText());
        System.out.println(mRegister.getmPhoneInt());
        System.out.println(mRegister.getmEmailText());
        System.out.println(mRegister.getmAddressText());
    }
}
