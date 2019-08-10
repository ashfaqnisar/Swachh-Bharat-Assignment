package com.rubicon.swachh.ui;

import com.rubicon.swachh.models.UserData;
import com.rubicon.swachh.other.Saver;
import com.rubicon.swachh.other.Validator;

import java.util.Scanner;

public class Register {


    private UserData userData = new UserData();
    private Validator validator = new Validator();

    public Register() throws Exception {
        System.out.println("\nRegistration: ");
        System.out.print("Hello There, Please provide your name: ");
        Scanner mScanner = new Scanner(System.in);
        userData.setName(validator.checkName(mScanner.nextLine().trim()));

        System.out.print("\n");

        System.out.print("Hi " + userData.getName() + ", can you please provide your email address: ");
        //System.out.print("Don't Worry, we are not going to spam you");
        userData.setEmail(validator.checkEmail(mScanner.nextLine().trim()));

        System.out.print("\n");

        System.out.print("Hey " + userData.getName() + ", please provide your number: ");
        userData.setNumber(validator.checkNumber(mScanner.nextLine().trim()));

        System.out.print("\n");

        System.out.print("Hey " + userData.getName() + ", can you provide your address: ");
        userData.setAddress(validator.checkAddress(mScanner.next().trim()));

        Saver saver = new Saver();
        saver.storeTheUser(userData);

    }


    public UserData getUserData() {
        return userData;
    }
}
