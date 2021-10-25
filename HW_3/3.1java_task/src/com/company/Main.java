package com.company;

import java. lang. Math. *;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.print("Enter the radius length value: ");
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt();
    double p = 2 * r * Math. PI;
    double s = Math. PI * r * r;
    System.out.println("Perimeter value: " + p);
    System.out.println("The value of the area: " + s);

    }
}
