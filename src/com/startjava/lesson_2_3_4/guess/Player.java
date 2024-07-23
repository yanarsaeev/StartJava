package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int num;

    private int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getNum() {
        return num;
    }

    void setNum(int num) {
        this.num = num;

        int count = 0;
        while (count < nums.length) {
            if (nums[count] == 0) {
                nums[count] = num;
                break;
            }
            count++;
        }
    }

    int[] getNums() {
        return nums;
    }
}