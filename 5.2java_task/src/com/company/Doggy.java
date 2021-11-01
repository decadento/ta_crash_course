package com.company;

public class Doggy {
    public enum Breed {
        SPITZ,
        BULLDOG,
        TERRIER
    }
    private String name;
    private Breed dogBreed;
    private int age;
    public Doggy(String name, Breed dogBreed, int age) {
        this.name = name;
        this.dogBreed = dogBreed;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Breed getDogBreed() {
        return this.dogBreed;
    }
    public void setDogBreed() {
        this.dogBreed = dogBreed;
    }
}
