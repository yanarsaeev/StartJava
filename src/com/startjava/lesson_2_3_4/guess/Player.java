package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] nums = new int[10];
    private int attempt;
    private int win;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setNum(int num) {
        if (num > 0 && num < 101) {
            nums[attempt - 1] = num;
        }
    }

    int getNum() {
        return nums[attempt - 1];
    }

    int getAttempt() {
        return attempt;
    }

    void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    void setWin() {
        win++;
    }

    public int getWin() {
        return win;
    }

    int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    void clearNums() {
        Arrays.fill(nums, 0, attempt, 0);
    }
}