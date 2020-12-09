package newGarden;

public class Tree extends Plants implements checkWater {

    public Tree(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean checkTreeWater() {
        if (this.waterAmount < 5.0) {
            System.out.println("The " + this.colour + " tree needs water");
            return true;
        } else
            System.out.println("The " + this.colour + " tree doesn't need water");
        return false;
    }


    @Override
    public boolean checkFlowerWater() {
        if (this.waterAmount < 5.0) {
            System.out.println("The " + this.colour + " flower needs water");
            return true;
        } else
            System.out.println("The " + this.colour + " flower doesn't need water");
        return false;
    }
}
