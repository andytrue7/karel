package com.shpp.p2p.cs.atrubchanynov.assigment1;

import com.shpp.karel.KarelTheRobot;

// MiddlePointFinding
public class Assignment1Part3 extends SuperKarel {
    @Override
    public void run() throws Exception {
        fillTheRowWithBeepers();
        process();
    }

    /**
     * Implement the middle search algorithm
     * @throws Exception
     */
    private void process() throws Exception {
        while (beepersPresent()) {
            pickBeeperAtRowEdge();
            move();
            pickOutermostBeeper();
            putBeeperIfNotPresent();
        }
    }

    /**
     * Put the beeper at the middle when all collected
     * @throws Exception
     */
    private void putBeeperIfNotPresent() throws Exception {
        if (noBeepersPresent()) {
            turnAround();
            move();
            putBeeper();
            move();
        }
    }

    /**
     *
     * @throws Exception
     */
    private void pickBeeperAtRowEdge() throws Exception {
        if (frontIsBlocked()) {
            turnAround();
            pickBeeper();
        }
    }

    /**
     *
     * @throws Exception
     */
    private void pickOutermostBeeper() throws Exception {
        if (noBeepersPresent()) {
            turnAround();
            move();
            pickBeeper();
            move();
        }
    }

    /**
     *
     * @throws Exception
     */
    private void fillTheRowWithBeepers() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
            putBeeperIfNoPresent();
        }
    }
}
