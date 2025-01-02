package com.codedifferently.lab.partA;

public class Chickens01 {
    //Put your code here

    public static void main(String[] args) {
        calculateTotalEggs(5, 3);
        calculateTotalEggs(4, 8);
    }

    private static void calculateTotalEggs(int eggsPerChicken, int chickenCount) {
        int totalEggs = 0;

        totalEggs += chickenCount * eggsPerChicken;
        chickenCount += 1;
        totalEggs += chickenCount * eggsPerChicken;
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;

        System.out.println(totalEggs);
    }
}
