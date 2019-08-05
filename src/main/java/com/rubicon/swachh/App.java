package com.rubicon.swachh;

import com.rubicon.swachh.util.WastageType;

public class App
{
    public static void main(String[] args)
    {
        Register register = new Register();
        Login login = new Login();

        Wastage wastage = new Wastage();

        WastageType wastageType = wastage.generateWastageForm();

        System.out.println(wastageType.isGlass());
        System.out.println(wastageType.isMetal());
        System.out.println(wastageType.isPlastic());



//        User user1 = login.generateLoginForm();
//        //User user2 = register.generateRegistrationForm();
//        //System.out.println(user1.getName());
//        System.out.println(user1.getEmail());
//        //System.out.println(user1.getAddress());
//        System.out.println(user1.getNumber());

    }
}
