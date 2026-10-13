package com.shpp.p2p.cs.atrubchanynov.assigment1;

import com.shpp.karel.KarelTheRobot;

public class SuperKarel extends KarelTheRobot {
    public void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    protected void moveMultipleTimes(int times) throws Exception {
        for (int i = 0; i < times; i++) {
            if (frontIsClear()) {
                move();
            } else {
                turnAround();
            }
        }
    }
}
