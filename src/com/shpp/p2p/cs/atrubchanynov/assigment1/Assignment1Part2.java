package com.shpp.p2p.cs.atrubchanynov.assigment1;

import com.shpp.karel.KarelTheRobot;

// StoneMason Task
public class Assignment1Part2 extends SuperKarel {

    @Override
    public void run() throws Exception {
        while(facingEast()) {
            processColumn();
            moveToNextColumn();
        }
    }

    private void processColumn() throws Exception {
        putBeeperIfNoPresent();

        if (leftIsClear()) {
            turnLeft();

            moveWhileClear();
            turnAroundIfBlocked();

            moveWhileClear();
            turnLeft();
        }
    }

    private void moveToNextColumn() throws Exception {
        if (frontIsClear()) {
            moveMultipleTimes(4);
        } else {
            turnAround();
        }
    }

    private void turnAroundIfBlocked() throws Exception {
        if (frontIsBlocked()) {
            turnAround();
        }
    }

    private void moveWhileClear() throws Exception {
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
