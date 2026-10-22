package com.shpp.p2p.cs.atrubchanynov.assignment1;

/**
 * A class for the MiddlePointFinding
 */
public class Assignment1Part2 extends SuperKarel {
    @Override
    public void run() throws Exception {
        layBeepersWithEmptyEnds();
        removeBeepersFromBothEnds();
        markMiddleCell();
    }

    /**
     * The method puts beepers along the row except both ends
     * Ends on the outermost beeper, facing the rest of the row
     */
    private void layBeepersWithEmptyEnds() throws Exception {
        fillTheRowWithBeepers();
        pickBeeper();
        turnAround();

        moveIfClear();
    }

    /**
     * * Removes the outermost beeper at each end, alternating sides.
     * * The empty end cells keep Karel from walking into a wall.
     * * Ends on the empty cell just past the last beeper removed.
     */
    private void removeBeepersFromBothEnds() throws Exception {
        while (beepersPresent()) {
            walkPastBeepers();

            turnAround();
            move();
            pickBeeper();
            move();
        }
    }

    private void markMiddleCell() throws Exception {
        turnAround();
        moveIfClear();
        putBeeperIfNotPresent();
    }

    private void walkPastBeepers() throws Exception {
        while (beepersPresent()) {
            move();
        }
    }

    /**
     * Puts beepers on every cell except the first.
     * In a 1-cell world the only cell gets a beeper.
     */
    private void fillTheRowWithBeepers() throws Exception {
        while (frontIsClear()) {
            move();
            putBeeperIfNotPresent();
        }

        putBeeperIfNotPresent();
    }
}
