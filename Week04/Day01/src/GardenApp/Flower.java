package GardenApp;

import java.util.ArrayList;
import java.util.List;

//The Flower
//        needs water if its current water amount is less then 5
//        when watering it the flower can only absorb the 75% of the water
//        eg. watering with 10 the flower's amount of water should only increase with 7.5
public class Flower extends Garden {

    public Flower(double waterAmount, String colour) {
        super(waterAmount);
        this.colour=colour;
    }

    public Flower(String colour) {
    }


    public void checkFlowerWater(Flower flower) {
        if (flower.waterAmount < 5.0)
            System.out.println("The " + flower.colour + " flower needs water");
        else
            System.out.println("The " + flower.colour + " flower needs water");
    }

    public void watering(double water) {
        System.out.println("Watering with " + water);
        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).waterAmount += water / plants * 0.75;
            checkFlowerWater(flowers.get(i));
        }
    }
}
