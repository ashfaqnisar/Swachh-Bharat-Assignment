package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.UserData;

import java.util.Scanner;


public class Login {

    private UserData userData = new UserData();

    private Login() {
        System.out.print("Login \n");

        System.out.print("Hello there, can you provide your email id: ");
        Scanner mScanner = new Scanner(System.in);
        userData.setEmail(mScanner.nextLine());

        System.out.print("\n");

        System.out.print("Thank you, please provide the number: ");
        userData.setNumber(mScanner.nextLong());
    }

    UserData getUserData() {
        return userData;
    }
}
