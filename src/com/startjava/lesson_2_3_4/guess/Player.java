package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setNums(int idx, int num) {
        this.nums[idx - 1] = num;
    }

    int getNum(int num) {
        for (int i : nums) {
            if (num == i) {
                return num;
            }
        }
        return 0;
    }

    void getNums(int num) {
        System.out.println(Arrays.toString(Arrays.copyOf(nums, num)));
    }

    void clearNums(int num) {
        Arrays.fill(nums, 0, num, 0);
    }

    boolean hasWon(int targetNum) {
        for (int num : this.nums) {
            if (num == targetNum) {
                return true;
            }
        }
        return false;
    }
}