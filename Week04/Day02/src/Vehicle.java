public abstract class Vehicle implements Flyable{
private int weight;
private int length;
private int passengers;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void fly() {
        System.out.println("i'm flying");
    }

    public void land() {
        System.out.println("Landing!");
    }

    public void takeOff() {
        System.out.println("Watch out for take off!");
    }
}
