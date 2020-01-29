package com.luv2code.springdemo;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private int[] arr = new int[]{1,2,3};

    public static int getRandom(@NotNull int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    @Override
    public String getFortune() {
        if(getRandom(arr) == arr[0]){
            return "Today is your Lucky Day!";
        }
        else if(getRandom(arr) == arr[1]){
            return "Not so lucky but keep doing it!";
        }
        else{
            return "Try Harder";
        }
    }
}
