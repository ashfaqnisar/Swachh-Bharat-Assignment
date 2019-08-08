package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.UserData;
import com.rubicon.swachh.other.Saver;

import java.util.Scanner;

public class Register {


    private UserData userData = new UserData();

    public Register() throws Exception {
        System.out.println("Registration: ");
        System.out.print("Hello There, Please provide your name: ");
        Scanner mScanner = new Scanner(System.in);
        userData.setName(mScanner.nextLine());

        System.out.print("\n");

        System.out.print("Hi " + userData.getName() + ", can you please provide your email address: ");
        //System.out.print("Don't Worry, we are not going to spam you");
        userData.setEmail(mScanner.nextLine());

        System.out.print("\n");

        System.out.print("Hey " + userData.getName() + ", please provide your number: ");
        userData.setNumber(mScanner.nextLong());

        System.out.print("\n");

        System.out.print("Hey " + userData.getName() + ", can you provide your address: ");
        userData.setAddress(mScanner.next());

        Saver saver = new Saver();
        saver.storeTheUser(userData);

    }


    public UserData getUserData() {
        return userData;
    }
}
