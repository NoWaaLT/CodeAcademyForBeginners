package interfaceEx;

public class Hovercraft implements isLandVehicle, isSeaVessel{

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public void drive() {
        System.out.println("Hovercraft driving!");
    }

    @Override
    public int getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(int displacement) {

    }

    @Override
    public void launch() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setMaxPassengers(int sk) {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {

    }
    void enterLand() {
        System.out.println("Hovercraft entered land");
    }
    void enterSea() {
        System.out.println("Hovercraft entered sea");
    }
}
