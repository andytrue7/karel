package com.shpp.p2p.cs.atrubchanynov.assignment1;

/**
 * A class for the StoneMason Task
 */
public class Assignment1Part1 extends SuperKarel {

    @Override
    public void run() throws Exception {
        while (frontIsClear()) {
            repairColumn();
            moveToNextColumn();
        }

        repairColumn();
    }

    /**
     * Fills missing stones in the current column.
     * Starts and ends at the bottom of the column, facing east.
     */
    private void repairColumn() throws Exception {
        putBeeperIfNotPresent();
        turnLeft();
        fillColumn();
        returnToBottom();
    }

    /**
     * Columns are 4 apart (task guarantee)
     */
    private void moveToNextColumn() throws Exception {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }

    /**
     * Fill column with beepers
     */
    private void fillColumn() throws Exception {
        while (frontIsClear()) {
            move();
            putBeeperIfNotPresent();
        }
    }
}
