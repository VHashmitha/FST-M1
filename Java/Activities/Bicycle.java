package activities;

//Base class
class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int currentSpeed;

    //the activities.Bicycle class has one constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    //activities.Bicycle class has three methods
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }

    //Method to print info of activities.Bicycle
    public String bicycleDesc() {
        return ("No of gears are " + gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
