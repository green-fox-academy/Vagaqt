package main.FarmProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Farm {
    private static ArrayList<Animal> myAnimals;

    public Farm() {
        myAnimals = new ArrayList<>(15);
    }

    static void addAnimal(Animal animal) {
        myAnimals.add(animal);
    }

    static void breed() {
        Random random = new Random();
        int randomNumber = random.nextInt(myAnimals.size());
        if (myAnimals.size() < 15) {
            Animal newAnimal = myAnimals.get(randomNumber);
            myAnimals.add(newAnimal);
        }
    }

    static void slaughter() {
        int leastHungry;
        for (int i = 0; i < myAnimals.size()-1; i++) {
            if (myAnimals.get(i).hunger < myAnimals.get(i + 1).hunger) {
                leastHungry = i + 1;
            } else {
                leastHungry = i;
            }
            myAnimals.remove(leastHungry);
        }
    }


    static void playTime(int dayCount) {
        Random random = new Random();
        for (int i = 0; i < dayCount; i++) {
            int randomAnimalPlayingEatingAndDrinking = random.nextInt(myAnimals.size());
            Animal randomAnimal = myAnimals.get(randomAnimalPlayingEatingAndDrinking);
            randomAnimal.play();
        }

    }


    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        Farm slaughterhouse = new Farm();
        Animal catdog = new Animal("catdog");
        Animal unicorn = new Animal("unicorn");
        Animal turtleBro = new Animal("turtleBro");
        Animal halfSpider = new Animal("halfSpider");
        Animal fridge = new Animal("fridge");
        addAnimal(catdog);
        addAnimal(unicorn);
        addAnimal(turtleBro);
        addAnimal(halfSpider);
        addAnimal(fridge);
        breed();
        breed();
        breed();
        breed();
        breed();
        breed();
        breed();
        for (int i = 0; i < myAnimals.size(); i++) {
            System.out.println(myAnimals.get(i).name);
        }
        playTime(15);
        slaughter();
        slaughter();
        slaughter();
        slaughter();
        slaughter();
        slaughter();
        slaughter();
        slaughter();
        slaughter();
        slaughter();
        System.out.println("HERE COMES JOHNNY!!!!!!!!!");
        for (int i = 0; i < myAnimals.size(); i++) {
            System.out.println(myAnimals.get(i).name);
        }

    }
}
