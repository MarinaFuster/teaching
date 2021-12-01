package com.mfuster.ships;

public interface Ship {
    void accelerate(double acceleration);
    void travel(double distance);
    void shoot(int bombs);
    void stop();
    void anchorShip();
    void changeFlag(String flag);
}
