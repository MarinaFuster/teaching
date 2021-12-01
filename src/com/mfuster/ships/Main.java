package com.mfuster.ships;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ship newShip = new PirateShip();

        newShip.accelerate(3.0);
        newShip.travel(100.0);
        newShip.stop();
        newShip.changeFlag("The best ship of all times");
        newShip.shoot(10);
        newShip.travel(200.0);
        newShip.anchorShip();

        List<Ship> list = new LinkedList<>();
        list.add(newShip);
    }
}

