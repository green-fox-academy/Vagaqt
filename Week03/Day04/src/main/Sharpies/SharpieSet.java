package main.Sharpies;

import main.Sharpies.Sharpie;

import java.util.ArrayList;

public class SharpieSet {

    private static ArrayList<Sharpie> myCollection;

    public SharpieSet() {
        myCollection = new ArrayList<>();
    }

    public static void countUsable() {
        int a = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i).inkAmount > 0) {
                a += 1;
            }
        }
        System.out.println("Number of usable sharpies = " + a);

    }

    public static void removeTrash() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i).inkAmount == 0) {
                System.out.println("The following sharpies ran out of ink and ended up in the bin: " + myCollection.get(i).colour);
                myCollection.remove(i);
            }
        }
    }

    static void add(Sharpie sharpie) {
        myCollection.add(sharpie);
    }

    public static void main(String[] args) {
        SharpieSet mySharpies = new SharpieSet();
        Sharpie orange = new Sharpie("orange", 0.5f);
        Sharpie blue = new Sharpie("blue", 0.75f);
        Sharpie green = new Sharpie("green", 0.75f);
        Sharpie pink = new Sharpie("pink", 0.5f);
        SharpieSet.add(orange);
        SharpieSet.add(blue);
        SharpieSet.add(green);
        SharpieSet.add(pink);
        countUsable();
        orange.use(20);
        removeTrash();

    }


}
