package LiskovSubstitutionPrinciple;

public class Bike implements Vechicle, TurnOnEngine{
    @Override
    public void turnOnEngine() {
        // bike will start its engine
    }

    @Override
    public void accelerate() {
        int speed = 10;
        speed += 10;
    }
}
