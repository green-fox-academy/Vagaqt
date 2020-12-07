package GardenApp;

import java.util.ArrayList;
import java.util.List;

//The Garden
//        is able to hold unlimited amount of flowers or trees
//        when watering it should only water those what needs water with equally divided amount amongst them
//        eg. watering with 40 and 4 of them need water then each gets watered with 10
public class Garden {
    public String colour;
    public double waterAmount = 0.0;
    public List<Flower> flowers = new ArrayList<>();
    public List<Tree> trees = new ArrayList<>();
    public int plants = flowers.size() + trees.size();

    public Garden(double waterAmount) {
        this.waterAmount = waterAmount;

    }
}
