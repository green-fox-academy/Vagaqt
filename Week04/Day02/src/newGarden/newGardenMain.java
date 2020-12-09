package newGarden;

public class newGardenMain {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");
        garden.addFlower(yellow);
        garden.addFlower(blue);
        garden.addTree(purple);
        garden.addTree(orange);

        garden.needsWatering();
        garden.Watering(40);
        garden.needsWatering();
        garden.Watering(40);
        garden.needsWatering();


//
//        for (Flower flower : garden.flowers
//        ) {
//            flower.checkFlowerWater();
//            if (true) System.out.println("mukodik ez a szar");
//            else System.out.println("nem");
//        }
//        for (Tree tree : garden.trees
//        ) {
//            tree.checkTreeWater();
//            if (true) System.out.println("mukodik ez a szar");
//            else System.out.println("nem");
//        }


    }
}
