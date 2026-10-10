package com.shpp.p2p.cs.atrubchanynov.assigment1;


import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {
    @Override
    public void run() throws Exception {
        moveMultipleTimes(4);
        pickBeeper();
        turnMultipleTimes(2);
        moveMultipleTimes(4);
    }

    private void moveMultipleTimes(int times) throws Exception {
        for (int i = 0; i < times; i++) {
            move();
        }
    }

    private void turnMultipleTimes(int times) throws Exception {
        for (int i = 0; i < times; i++) {
            turnLeft();
        }
    }
}
