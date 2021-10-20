package com.company;
import java.util.Scanner;

public class Main {
    static boolean Main(int a, int b, int c, int x, int y){ //describe a function with length variables

        if(a <= x && b <= y ) { //block with conditions for comparing lengths
            System.out.println("The brick passed through the hole");
        }
        else if(a <= x && c <= y ) {
            System.out.println("The brick passed through the hole");
        }
        else if(b <= x && c <= y ) {
            System.out.println("The brick passed through the hole");
        }
        else if(a <= y && b <= x ) {
            System.out.println("The brick passed through the hole");
        }
        else if(c <= x && a <= y ) {
            System.out.println("The brick passed through the hole");
        }
        else if(c <= x && b <= y ) {
            System.out.println("The brick passed through the hole");
        }
        else
            System.out.println("The brick did not pass through the hole");
    return true;
    }

    public static void main(String[] args) {

    String newLine = System.getProperty("line.separator"); //string for the separator

    Scanner in = new Scanner(System.in); //scanner for reading input

    System.out.print("-Brick rib lengths-" + newLine);

    System.out.print("Enter the value of parameter a: "); //block with input reading
    int a = in.nextInt();
    System.out.print("Enter the value of parameter b: ");
    int b = in.nextInt();
    System.out.print("Enter the value of parameter c: ");
    int c = in.nextInt();

    System.out.print("-The lengths of the sides of the hole-" + newLine);


    System.out.print("Enter the value of parameter x: ");
    int x = in.nextInt();
    System.out.print("Enter the value of parameter y: ");
    int y = in.nextInt();


    if(a<0 || b<0 || c<0 || x<0 || y<0) {  //checking the correctness of the entered data
            System.out.println("Enter the correct values!");
        } else {
        Main(a, b, c, x, y); //function call
    }

    }
}
