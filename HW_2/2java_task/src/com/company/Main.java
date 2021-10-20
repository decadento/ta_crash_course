package com.company;
import java.util.Scanner;

public class Main {

    public static void a(int number){
        int digit = 3;
        boolean flag = true;
        while (number > 0) {
            if (number % 10 == digit) {
                System.out.println("3 is present in given numeric");
                flag = false;
                break;
            }
            number /= 10;
        }

        if (flag) System.out.println("3 is not present in given numeric");
    }

    public static void b(int n){
        String s = Integer.toString(n);
        String result = s.substring(s.length()-1);

        for (int i = s.length() - 2; i >= 0; i--){
            result = result.concat(s.substring(i, i+1));
        }

        n = Integer.parseInt(result);
        System.out.println(n);
    }

    public static void c(int number) {
        //int number = 123456789;
        String text = String.valueOf(number);
        text = text.substring(text.length() - 1) + text.substring(1, text.length() - 1) + text.substring(0, 1);
        number = Integer.parseInt(text);
        System.out.println(number);
    }

    public static void d(int number) {
        System.out.println("1"+number+"1");
    }

    public static void main(String[] args) {
        long n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextLong();
        if (n <= 0) {
            System.out.println("A natural number must be positive!");
        } else {
            System.out.print("a) ");
            a((int) n);
            System.out.print("b) ");
            b((int) n);
            System.out.print("c) ");
            c((int) n);
            System.out.print("d) ");
            d((int) n);
        }
    }
}



