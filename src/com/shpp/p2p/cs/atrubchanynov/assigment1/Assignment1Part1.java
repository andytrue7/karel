package com.shpp.p2p.cs.atrubchanynov.assigment1;


import com.shpp.karel.KarelTheRobot;

// Intro Task
public class Assignment1Part1 extends SuperKarel {
    @Override
    public void run() throws Exception {
        moveMultipleTimes(4);
        pickBeeper();
        turnAround();
        moveMultipleTimes(4);
    }
}
