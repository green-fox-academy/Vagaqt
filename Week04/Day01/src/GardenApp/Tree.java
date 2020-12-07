package GardenApp;

import java.util.ArrayList;
import java.util.List;

//The Tree
//        needs water if its current water amount is less then 10
//        when watering it the tree can only absorb the 40% of the water
//        eg. watering with 10 the tree's amount of water should only increase with 4
public class Tree extends Garden {
    String colour;

    public Tree(double waterAmount, String colour) {
        super(waterAmount);
        this.colour = colour;
    }
    public Tree(String colour);

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void checkTreeWater(Tree tree) {
        if (tree.waterAmount < 10)
            System.out.println("The " + colour + " tree needs water");
        else
            System.out.println("The " + colour + " tree needs water");
    }

    public void watering(double water) {
        System.out.println("Watering with " + water);
        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).waterAmount += water / plants * 0.4;
            checkTreeWater(trees.get(i));
        }
    }
}
