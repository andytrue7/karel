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

    /**
     * Put beepers moving to the wall, then turns back to the init row
     * @throws Exception
     */
    private void processColumn() throws Exception {
        putBeeperIfNoPresent();

        if (leftIsClear()) {
            turnLeft();

            fillColumn();
            turnAroundIfBlocked();

            fillColumn();
            turnLeft();
        }
    }

    /**
     *
     * @throws Exception
     */
    private void moveToNextColumn() throws Exception {
        if (frontIsClear()) {
            moveMultipleTimes(4);
        } else {
            turnAround();
        }
    }

    /**
     *
     * @throws Exception
     */
    private void turnAroundIfBlocked() throws Exception {
        if (frontIsBlocked()) {
            turnAround();
        }
    }

    /**
     *
     * @throws Exception
     */
    private void fillColumn() throws Exception {
        while(frontIsClear()) {
            move();
            putBeeperIfNoPresent();
        }
    }
}
