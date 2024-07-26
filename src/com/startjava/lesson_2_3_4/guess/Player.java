package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] nums = new int[10];

    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getAttempt() {
        return attempt;
    }

    void setAttempt(int idx, int attempt) {
        this.attempt = attempt;
        this.nums[idx - 1] = attempt;
    }

    void getNums(int num) {
        int[] temp = Arrays.copyOf(nums, num);
        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 0, temp.length / 2)) + "\n" +
                Arrays.toString(Arrays.copyOfRange(temp, temp.length / 2, temp.length)));
    }

    void clearNums(int num) {
        Arrays.fill(nums, 0, num, 0);
    }
}