package com.rubicon.swachh;

import com.rubicon.swachh.models.UserData;

import java.util.Scanner;


public class Login {

    private UserData userData = new UserData();
    private Scanner mScanner = new Scanner(System.in);

    UserData generateLoginForm() {
        System.out.print("Login \n");

        System.out.print("Hello there, can you provide your email id: ");
        userData.setEmail(mScanner.nextLine());

        System.out.print("\n");

        System.out.print("Thank you, please provide the number: ");
        userData.setNumber(mScanner.nextLong());

        return userData;
    }
}
