package interfaceEx;

public class Jeep implements isLandVehicle {


    void soundHorn() {
        System.out.println("Horn");
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public void drive() {
        System.out.println("Jeep driving!");
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
}
