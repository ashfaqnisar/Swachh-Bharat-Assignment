package com.rubicon.swachh;

import com.rubicon.swachh.models.UserData;
import com.rubicon.swachh.other.Saver;

import java.io.IOException;
import java.util.Scanner;

public class Register {


    private UserData userData = new UserData();
    private Scanner mScanner = new Scanner(System.in);
    private Saver saver = new Saver();

    public Register() throws Exception {
        System.out.println("Registration: ");
        System.out.print("Hello There, Please provide your name: ");
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

        System.out.print("\n");
    }


    UserData generateRegistrationForm() throws Exception {


        saver.storeTheUser(userData);


        return userData;
    }
}
