package com.shpp.p2p.cs.atrubchanynov.assignment1;

/**
 * A class for the ChessBoard Task
 */
public class Assignment1Part3 extends SuperKarel {
    @Override
    public void run() throws Exception {
        turnNorthAtWall();
        fillChessBoard();
    }

    /**
     * fill the board with beepers
     * @throws Exception
     */
    private void fillChessBoard() throws Exception {
        putBeeper();

        while (frontIsClear()) {
            move();

            turnNorthAtWall();

            if (frontIsClear()) {
                move();
                putBeeper();
            }

            shiftToNextRowAtEastWall();
            turnIntoNextRow();
        }
    }

    /**
     * Turn north when reached wall edge
     * @throws Exception
     */
    private void turnNorthAtWall() throws Exception {
        if (frontIsBlocked() && leftIsClear() && facingEast()) {
            turnLeft();
        }

        if (frontIsBlocked() && rightIsClear() && facingWest()) {
            turnRight();
        }
    }

    /**
     * Turn to the available side facing north
     * @throws Exception
     */
    private void turnIntoNextRow() throws Exception {
        if (facingNorth() && leftIsClear()) {
            turnLeft();
        }

        if (facingNorth() && rightIsClear()) {
            turnRight();
        }
    }

    /**
     * Move to the next row when the row has odd number of cells
     * @throws Exception
     */
    private void shiftToNextRowAtEastWall() throws Exception {
        if (frontIsBlocked() && beepersPresent() && facingEast() && leftIsClear()) {
            turnLeft();
            move();
            turnLeft();
            move();
            putBeeper();
        }
    }
}
