package LiskovSubstitutionPrinciple;

public class Bicycle implements Vechicle{
    @Override
    public void accelerate() {
        // the accerlation of bicycle is dependent on the rider, which used to ride the bike.
    }
}
