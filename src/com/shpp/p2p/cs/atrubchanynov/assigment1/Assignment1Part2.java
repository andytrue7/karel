package com.shpp.p2p.cs.atrubchanynov.assigment1;

import com.shpp.karel.KarelTheRobot;

// StoneMason Task
public class Assignment1Part2 extends SuperKarel {

    @Override
    public void run() throws Exception {
        putBeeperIfNoPresent();
        while(facingEast()) {
            if (leftIsClear()) {
                turnLeft();

                putBeeperWhileClear();
                turnAroundIfBlocked();

                while (frontIsClear()) {
                    move();
                }
                turnLeft();
            }

            if (frontIsClear()) {
                moveMultipleTimes(4);
            } else {
                turnAround();
            }
        }
    }

    private void turnAroundIfBlocked() throws Exception {
        if (frontIsBlocked()) {
            turnAround();
        }
    }

    private void putBeeperWhileClear() throws Exception {
        putBeeperIfNoPresent();
        while(frontIsClear()) {
            move();
            putBeeperIfNoPresent();
        }
    }

    public void putBeeperIfNoPresent() throws Exception {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }
}
