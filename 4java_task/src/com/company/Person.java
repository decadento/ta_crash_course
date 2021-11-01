package com.company;
import java.util.Scanner;
import java.util.Calendar;

public class Person {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int birthYear;
    private int age;

    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }
    public Person ()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getBirthYear()
    {
        return this.birthYear;
    }
    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }
    public int calculateAge()
    {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }
    public void inputInfo()
    {
        String name = this.getName();
        int birthYear = this.getBirthYear();
    }
    public void outputInfo()
    {
        age = this.calculateAge();

        System.out.println("Name of the student is " + name);
        System.out.println("Year of student`s birth is " + birthYear);
        System.out.println("Student is " + age + " years old");
    }
    public void changeName()
    {
        System.out.println("Input your name: ");
        String newName = sc.nextLine();
        this.setName(newName);
    }
}
