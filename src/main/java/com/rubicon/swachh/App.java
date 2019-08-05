package com.rubicon.swachh;

import com.rubicon.swachh.util.Report;

public class App
{
    public static void main(String[] args)
    {
        Register register = new Register();
        Wastage wastage = new Wastage();

        Report report = new Report();

        report.setUser(register.generateRegistrationForm());
        report.setWastageType(wastage.generateWastageForm());

        System.out.println(report.getReport());

//        System.out.println(user2.getName());
//        System.out.println(user2.getEmail());
//        System.out.println(user2.getAddress());
//        System.out.println(user2.getNumber());
//
//        System.out.println(wastageType.isGlass());
//        System.out.println(wastageType.isPlastic());
//        System.out.println(wastageType.isMetal());


//

    }
}
