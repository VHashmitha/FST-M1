package activities;

//Derived class
class MountainBike extends Bicycle {

    //The activities.MountainBike subclass adds one more field
    public int seatHeight;

    //The activities.MountainBike subclass has one constructor
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(activities.Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    // the activities.MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
    }
}
