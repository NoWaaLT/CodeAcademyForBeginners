package interfaceEx;

public class Frigate implements isSeaVessel {
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

    void fireGun() {
        System.out.println("Fire!!!");
    }
}
