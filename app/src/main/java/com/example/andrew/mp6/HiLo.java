/*
package com.example.andrew.mp6;

public class HiLo {
    private int highScore;
    private String name;
    HiLo() {
        name = "Player";
        highScore = 0;
    }
    HiLo(String name) {
        this.name = name;
        highScore = 0;
    }
    public int numberGen() {
        int output = (int) ((Math.random() * 10) + 1);
        return output;
    }
    public boolean gameTest (int seen, int invisible, boolean choice) {
        //returns true if they are correct, false if game is over
        //choice is "lower" if false, "higher" if true
        if (choice) {
            if(seen < invisible) {
                return true;
            } else {
                return false;
            }
        } else {
            if(invisible < seen) {
                return true;
            } else {
                return false;
            }

        }
    }
    public void setHighScore(int x) {
        highScore = x;
    }
    public int getHighScore() {
        return highScore;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
*/
