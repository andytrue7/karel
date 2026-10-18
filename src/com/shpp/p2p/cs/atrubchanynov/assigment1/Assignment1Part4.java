package com.shpp.p2p.cs.atrubchanynov.assigment1;

// ChessBoard
public class Assignment1Part4 extends SuperKarel {
    @Override
    public void run() throws Exception {
        turnNorthAtEastWall();
        fillChessBoard();
    }

    private void fillChessBoard() throws Exception {
        putBeeper();

        while (frontIsClear()) {
            move();

            turnNorthAtEastWall();
            turnNorthAtWestWall();

            if (frontIsClear()) {
                move();
                putBeeper();
            }

            shiftToNextRowAtEastWall();
            turnIntoNextRow();
        }
    }

    private void turnNorthAtEastWall() throws Exception {
        if (frontIsBlocked() && leftIsClear() && facingEast()) {
            turnLeft();
        }
    }

    private void turnNorthAtWestWall() throws Exception {
        if (frontIsBlocked() && rightIsClear() && facingWest()) {
            turnRight();
        }
    }

    private void turnIntoNextRow() throws Exception {
        if (facingNorth() && leftIsClear()) {
            turnLeft();
        }

        if (facingNorth() && rightIsClear()) {
            turnRight();
        }
    }

    // handle the case when the row has odd number of cells
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
