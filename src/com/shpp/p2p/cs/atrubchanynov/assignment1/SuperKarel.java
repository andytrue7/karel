package com.shpp.p2p.cs.atrubchanynov.assignment1;

import com.shpp.karel.KarelTheRobot;

/**
 * A super class for the Karel methods which used more than one time
 */
public class SuperKarel extends KarelTheRobot {
    protected void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }

    protected void turnAround() throws Exception {
        for (int i = 0; i < 2; i++) {
            turnLeft();
        }
    }

    protected void putBeeperIfNotPresent() throws Exception {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }

    protected void moveWhileClear() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }
}
