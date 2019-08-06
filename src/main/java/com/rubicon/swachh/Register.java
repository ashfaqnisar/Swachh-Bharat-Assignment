package com.rubicon.swachh;

import com.rubicon.swachh.models.User;

import java.util.Scanner;

public class Register {


    private User user = new User();
    private Scanner mScanner = new Scanner(System.in);


    User generateRegistrationForm() {
        System.out.println("Registration: ");
        System.out.print("Hello There, Please provide your name: ");
        user.setName(mScanner.nextLine());

        System.out.print("\n\n");

        System.out.print("Hi " + user.getName() + ", can you please provide your email address: ");
        user.setEmail(mScanner.nextLine());
        System.out.print("Don't Worry, we are not going to spam you");

        System.out.print("\n\n");

        System.out.print("Hey " + user.getName() + ", please provide your number: ");
        user.setNumber(mScanner.nextLong());

        System.out.print("\n\n");

        System.out.print("Hey " + user.getName() + ", can you provide your address: ");
        user.setAddress(mScanner.next());

        System.out.print("\n\n");

        return user;
    }
}
