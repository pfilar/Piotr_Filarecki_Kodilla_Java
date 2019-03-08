package com.kodilla;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextInt(51));

        int randomValue = random.nextInt(51);
        System.out.println(randomValue);
    }



}
