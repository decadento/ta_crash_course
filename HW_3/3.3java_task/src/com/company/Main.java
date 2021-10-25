package com.company;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {

    public static void price(int t1, int t2, int t3, int c1, int c2, int c3) {
        System.out.println("--------------------------");
        System.out.println("The cost of a call to a subscriber from the country 1: " + t1*c1);
        System.out.println("The cost of a call to a subscriber from the country 2: " + t2*c2);
        System.out.println("The cost of a call to a subscriber from the country 3: " + t3*c3);
    }

    public static void main(String[] args) {
        System.out.print("How long did the conversation with the subscriber from country 1 last?");
        Scanner scan = new Scanner(System.in);
        int t1 = scan.nextInt();
        System.out.print("How long did the conversation with the subscriber from country 2 last?");
        int t2 = scan.nextInt();
        System.out.print("How long did the conversation with the subscriber from country 3 last?");
        int t3 = scan.nextInt();
        System.out.println("--------------------------");
        System.out.print("What is the cost of a minute of conversation with a subscriber from country 1?");
        int c1 = scan.nextInt();
        System.out.print("What is the cost of a minute of conversation with a subscriber from country 2?");
        int c2 = scan.nextInt();
        System.out.print("What is the cost of a minute of conversation with a subscriber from country 3?");
        int c3 = scan.nextInt();

        price(t1, t2, t3, c1 ,c2, c3);

    }
}
