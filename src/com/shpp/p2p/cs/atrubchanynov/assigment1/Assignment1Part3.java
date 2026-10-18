package com.shpp.p2p.cs.atrubchanynov.assigment1;

import com.shpp.karel.KarelTheRobot;

// MiddlePointFinding
public class Assignment1Part3 extends SuperKarel {
    @Override
    public void run() throws Exception {
        fillTheRowWithBeepers();
        process();
    }

    private void process() throws Exception {
        while (beepersPresent()) {
            pickBeeperIfRowEdge();
            move();
            pickEdgeBeeper();
            putBeeperIfNotPresent();
        }
    }

    private void putBeeperIfNotPresent() throws Exception {
        if (noBeepersPresent()) {
            turnAround();
            move();
            putBeeper();
            move();
        }
    }

    private void pickBeeperIfRowEdge() throws Exception {
        if (frontIsBlocked()) {
            turnAround();
            pickBeeper();
        }
    }

    private void pickEdgeBeeper() throws Exception {
        if (noBeepersPresent()) {
            turnAround();
            move();
            pickBeeper();
            move();
        }
    }

    private void fillTheRowWithBeepers() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
            if (noBeepersPresent()) {
                putBeeper();
            }
        }
    }
}
