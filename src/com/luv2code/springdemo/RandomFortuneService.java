package com.luv2code.springdemo;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private int[] arr = new int[]{1,2,3};

    public static int getRandom(@NotNull int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    @Override
    public String getFortune() {
        if(getRandom(arr) == arr[0]){
            return "Beware of the wolf in sheep's clothing";
        }
        else if(getRandom(arr) == arr[1]){
            return "Diligence is the mother of good luck";
        }
        else{
            return "The journey is the reward";
        }
    }
}
