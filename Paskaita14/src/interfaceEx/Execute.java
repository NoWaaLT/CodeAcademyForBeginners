package interfaceEx;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Execute {
    public static void main(String[] args) {
        Jeep jeep1 = new Jeep();
        Frigate frigate1 = new Frigate();
        Hovercraft hovercraft1 = new Hovercraft();

        ArrayList list = new ArrayList<>();
        list.add(jeep1);
        list.add(frigate1);
        list.add(hovercraft1);

        PoliceCar pCar1 = new PoliceCar();
        PoliceCar pCar2 = new PoliceCar();
        PoliceCar pCar3 = new PoliceCar();

        list.add(pCar1);
        list.add(pCar2);
        list.add(pCar3);

    }
}
