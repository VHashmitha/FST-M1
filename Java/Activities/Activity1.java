package activities;

public class Activity1 {
    String color;
    String transmission;
    int make; int tyres; int doors;

    public void car() {
        String color;
        String transmission;
        int make; int tyres=4; int doors=4;
    }
    public void displayCharacteristics() {
        System.out.println(" Value of  variables color are" + color);
        System.out.println(" Value of  variables transmission are" + transmission);
        System.out.println(" Value of  variables make are" + make);
        System.out.println(" Value of  variables doors are" + doors);
        System.out.println(" Value of  variables tyres are" + tyres);

    }

    public void accelarate(){
        System.out.println("Car is moving forward");

    }

    public void brake(){
        System.out.println("Car has stopped");

    }



}
