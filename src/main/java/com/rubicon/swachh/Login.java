package com.rubicon.swachh;

import com.rubicon.swachh.models.User;

import java.util.Scanner;


public class Login {

    private User user = new User();
    private Scanner mScanner = new Scanner(System.in);

    User generateLoginForm() {
        System.out.print("Login \n");

        System.out.print("Hello there, can you provide your email id: ");
        user.setEmail(mScanner.nextLine());

        System.out.print("\n\n");

        System.out.print("Thank you, please provide the number: ");
        user.setNumber(mScanner.nextLong());

        return user;
    }
}
