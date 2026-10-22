package com.shpp.p2p.cs.atrubchanynov.assignment1;

/**
 * A class for the ChessBoard Task
 */
public class Assignment1Part3 extends SuperKarel {
    @Override
    public void run() throws Exception {
        fillColumnFromFirstRow();

        while (frontIsClear()) {
           if (beepersPresent()) {
               move();
               fillColumnFromSecondRow();
           } else {
               move();
               fillColumnFromFirstRow();
           }
        }
    }

    private void fillColumnFromSecondRow() throws Exception {
        turnLeft();

        if (frontIsClear()) {
            move();
            fillUpward();
        }

        returnToBottom();
    }

    private void fillColumnFromFirstRow() throws Exception {
        turnLeft();
        fillUpward();
        returnToBottom();
    }

    private void fillUpward() throws Exception {
        putBeeperIfNotPresent();

        while (frontIsClear()) {
            moveIfClear();

            if (frontIsClear()) {
                move();
                putBeeperIfNotPresent();
            }
        }
    }

}
