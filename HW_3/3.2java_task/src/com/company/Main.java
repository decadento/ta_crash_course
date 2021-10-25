package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String Name;
        String Address;


        System.out.println("What is your name?");
        Name = myObj.nextLine();
        System.out.println("Where are you live, " + Name + "?");
        Address = myObj.nextLine();
        System.out.println("Your name is " + Name + "and you live on " + Address);


    }
}
