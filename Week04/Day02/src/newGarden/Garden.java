package newGarden;

import java.util.ArrayList;
import java.util.List;

public class Garden implements needsWatering, Watering {
    //    public List<Flower> flowers = new ArrayList<>();
//    public List<Tree> trees = new ArrayList<>();
    public List<Plants> plants = new ArrayList<>();
    public int dryPlants;
    boolean flowersNeedsWatering = false;
    boolean treesNeedsWatering = false;

    public void addFlower(Flower flower) {
//        flowers.add(flower);
        plants.add(flower);
    }

    public void addTree(Tree tree) {
//        trees.add(tree);
        plants.add(tree);
    }

//
//    @Override
//    public void watering(int water) {
//        for (Tree tree : trees
//        )
//            if (tree.checkTreeWater() == true) {
//
//                tree.waterAmount += water * 0.4 / plants.size();
//            }
//        for (Flower flower : flowers
//        )
//            if (flower.checkFlowerWater() == true) {
//                flower.waterAmount += water*0.75 / plants.size();
//            }
//    }

    @Override
    public void needsWatering() {
        dryPlants = 0;
        for (Plants plant : plants
        ) {
            if (plant instanceof Flower && plant.waterAmount < 5) {
                System.out.println(plant.colour + " flower needs watering");
                flowersNeedsWatering = true;
            }
            if (plant instanceof Flower && plant.waterAmount >= 5) {
                System.out.println(plant.colour + " flower doesnt need watering");
                flowersNeedsWatering = false;
            }
            if (plant instanceof Tree && plant.waterAmount < 10) {
                System.out.println(plant.colour + " tree needs watering");
                treesNeedsWatering = true;
            }
            if (plant instanceof Tree && plant.waterAmount >= 10) {
                System.out.println(plant.colour + " tree doesnt need watering");
                treesNeedsWatering = false;
            }
        }
        for (Plants plant : plants
        ) {
            if (plant instanceof Flower && flowersNeedsWatering == true) {
                dryPlants++;
            }
            if (plant instanceof Tree && treesNeedsWatering == true)
                dryPlants++;
        }

    }
        @Override
        public void Watering ( double water){
            System.out.println("Watering with " + water);
            if (flowersNeedsWatering == true && treesNeedsWatering == true) {
                for (Plants plant : plants
                ) {
                    if (plant instanceof Flower) {
                        plant.waterAmount += water * 0.75 / dryPlants;
                    }
                    if (plant instanceof Tree) {
                        plant.waterAmount += water * 0.4 / dryPlants;
                    }
                }
            }
            if (flowersNeedsWatering == false && treesNeedsWatering == true) {
                for (Plants plant : plants
                ) {
                    if (plant instanceof Tree) {
                        plant.waterAmount += water * 0.4 / dryPlants;
                    }

                }
            }
            if (flowersNeedsWatering == true && treesNeedsWatering == false) {
                for (Plants plant : plants
                ) {
                    if (plant instanceof Flower) {
                        plant.waterAmount += water * 0.75 / dryPlants;
                    }
                }
            }


//        if (flowersNeedsWatering == true && treesNeedsWatering == false) {
//            for (Plants plants : plants) ;
//            if (plants instanceof Flower) {
//                Flower flower = (Flower) plants;
//                ((Flower) plants).waterAmount += water * 0.75 / ((Flower) plants).plants.size();
//            }
//        }
//        if (flowersNeedsWatering == false && treesNeedsWatering == true) {
//            for (Plants plants : plants) ;
//            if (plants instanceof Tree) {
//                Tree tree = (Tree) plants;
//                ((Tree) plants).waterAmount += water * 0.4 / ((Tree) plants).plants.size();
//            }
//        }

        }
    }