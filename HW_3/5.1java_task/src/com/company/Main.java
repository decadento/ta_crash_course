package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        any_zavd();
    }
    private static void first_zavd() {
        Scanner sc = new Scanner(System.in);
        String string1, string2, string3;
        System.out.println("Input three integers: ");
        float i = sc.nextFloat();
        float j = sc.nextFloat();
        float k = sc.nextFloat();
        if(-5 <= i && i <= 5)
        {
            string1 = (i + " in range");
        }
        else
        {
            string1 = (i + " not in range");
        }
        if(-5 <= j && j <= 5)
        {
            string2 = (j + " in range");
        }
        else
        {
            string2 = (j + " not in range");
        }
        if(-5 <= k && k <= 5)
        {
            string3 = (k + " in range");
        }
        else
        {
            string3 = (k + " not in range");
        }
        System.out.println(string1 + "\n" + string2 + "\n" + string3);
        any_zavd();
    }

    private static void second_zavd() {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        System.out.println("Input your three integers: ");
        for(int i = 0; i < 3; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Max value:" + arr[arr.length-1] + "\nMin value: " + arr[0]);
        any_zavd();
    }
    public enum HTTPError {
        ERROR_404_NOT_FOUND,
        ERROR_403_FORBIDDEN,
        ERROR_500_INTERNAL_SERVER,
        ERROR_503_SERVICE_UNAVAILABLE,
        ERROR_504_GATEWAY_TIMEOUT
    }
    private static void third_zavd()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter error number (403, 404, 500, 504, 504) :");

        int number = sc.nextInt();

        switch (number)
        {
            case 403:
                System.out.println(HTTPError.ERROR_403_FORBIDDEN);
                break;
            case 404:
                System.out.println(HTTPError.ERROR_404_NOT_FOUND);
                break;
            case 500:
                System.out.println(HTTPError.ERROR_500_INTERNAL_SERVER);
                break;
            case 503:
                System.out.println(HTTPError.ERROR_503_SERVICE_UNAVAILABLE);
                break;
            case 504:
                System.out.println(HTTPError.ERROR_504_GATEWAY_TIMEOUT);
                break;
            default :
                System.out.println("Error in input integers");
                break;
        }
        any_zavd();
    }

    private static void any_zavd()
    {
        Scanner sc = new Scanner(System.in);

        int taskNumber;

        System.out.println("");
        System.out.println("Input 1 to execute first_zavd");
        System.out.println("Input 2 to execute second_zavd");
        System.out.println("Input 3 to execute third_zavd");
        taskNumber = sc.nextInt();
        if(taskNumber == 1)
        {
            first_zavd();
        }
        else if(taskNumber == 2)
        {
            second_zavd();
        }
        else if(taskNumber == 3)
        {
            third_zavd();
        }
        else
        {
            System.out.println("Choose correct input(1/2/3)!");
        }
    }
}
