package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 0;
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

    boolean setNum(int num) {
        if (num > MIN_VALUE && num < MAX_VALUE) {
            nums[attempt - 1] = num;
            return true;
        }
        return false;
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

    void incrementWin() {
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