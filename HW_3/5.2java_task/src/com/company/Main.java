package com.company;

public class Main {
    public static void main(String[] args) {
        Doggy[] doggies = new Doggy[3];
        doggies[0] = new Doggy("Alfred", Doggy.Breed.Bulldog, 4);
        doggies[1] = new Doggy("Waldorf", Doggy.Breed.SPITZ, 8);
        doggies[2] = new Doggy("Bunckiz", Doggy.Breed.Terrier, 2);
        int max = doggies[0].getAge();
        int biggest_age = 0;
        for(int i = 0; i < doggies.length; i++)
        {
            if(doggies[i].getAge() > max)  {

                max = doggies[i].getAge();
                biggest_age++;
            }
        }
        int j;
        for(int i = 0; i < doggies.length; i++)
        {
            for(j = i + 1; j < doggies.length; j++) {
                if(doggies[i].getName()!= doggies[j].getName()) {
                    System.out.println(doggies[i].getName() + " does not called as " + doggies[j].getName());
                }
                else {
                    System.out.println(doggies[i].getName() + " called the same as " + doggies[j].getName());
                }
            }
        }
        System.out.println("Dog with the biggest age has " + max + " years old . It`s name is " + doggies[biggest_age].getName() + ". It is " + doggies[biggest_age].getDogBreed() + " breed.");
    }
}