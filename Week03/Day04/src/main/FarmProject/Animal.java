package main.FarmProject;

import java.util.function.IntFunction;

public class Animal{
    //    Create an Animal class
//    Every animal has a hunger value, which is a whole number
//                    Every animal has a thirst value, which is a whole number
//                    when creating a new animal object these values are created with the default 50 value
//    Every animal can eat() which decreases their hunger by one
//    Every animal can drink() which decreases their thirst by one
//    Every animal can play() which increases both by one

    public String name;
    public int hunger = 50;
    public int thirst = 50;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    void eat() {
        hunger -= 1;
        System.out.println("Animal ate some, its hunger value is now:" + hunger);
    }

    void drink() {
        thirst -= 1;
        System.out.println("Animal drank some, its thirst value is now:" + thirst);
    }

    void play() {
        hunger += 1;
        thirst++;
//        System.out.println("Animal played something, its hunger and thirst values now are:" + hunger + "; " + thirst);
    }

    public static void main(String[] args) {
        Animal pet = new Animal("catdog");
        pet.eat();
        pet.drink();
        pet.play();
    }


}
