package com.rubicon.swachh;

public class App 
{
    public static void main(String[] args)
    {
        Register object = new Register();

        User user = object.generateRegistrationForm();
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getAddress());
        System.out.println(user.getNumber());

    }
}
