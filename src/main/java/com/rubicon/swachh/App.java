package com.rubicon.swachh;

import com.rubicon.swachh.util.User;
import com.rubicon.swachh.util.WastageType;

public class App
{
    public static void main(String[] args)
    {
        Register register = new Register();
        Login login = new Login();

        Wastage wastage = new Wastage();

        User user1 = login.generateLoginForm();
        User user2 = register.generateRegistrationForm();
        WastageType wastageType = wastage.generateWastageForm();

        System.out.println(user1.getEmail());
        System.out.println(user1.getNumber());

        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getAddress());
        System.out.println(user2.getNumber());

        System.out.println(wastageType.isGlass());
        System.out.println(wastageType.isPlastic());
        System.out.println(wastageType.isMetal());


//

    }
}
