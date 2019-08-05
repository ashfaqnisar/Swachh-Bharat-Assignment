package com.rubicon.swachh;

import com.rubicon.swachh.util.User;

public class App
{
    public static void main(String[] args)
    {
        Register register = new Register();
        Login login = new Login();

        User user1 = login.generateLoginForm();
        //User user2 = register.generateRegistrationForm();
        //System.out.println(user1.getName());
        System.out.println(user1.getEmail());
        //System.out.println(user1.getAddress());
        System.out.println(user1.getNumber());

    }
}
