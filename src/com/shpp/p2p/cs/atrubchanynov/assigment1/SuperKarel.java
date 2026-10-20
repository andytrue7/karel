package com.shpp.p2p.cs.atrubchanynov.assigment1;

import com.shpp.karel.KarelTheRobot;

public class SuperKarel extends KarelTheRobot {
    protected void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     *
     * @throws Exception
     */
    protected void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    /**
     *
     * @param times
     * @throws Exception
     */
    protected void moveMultipleTimes(int times) throws Exception {
        for (int i = 0; i < times; i++) {
            if (frontIsClear()) {
                move();
            } else {
                turnAround();
            }
        }
    }

    /**
     *
     * @throws Exception
     */
    protected void putBeeperIfNoPresent() throws Exception {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }
}
