package com.mobileapps.week01test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise01
{
    /*
        1. Create a function to find the most occurrence of an integer value given an integer array.

        */

    public static void main(String[] args) {
        int numbers[] = new int[7];

        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 1;
        numbers[3] = 2;
        numbers[4] = 6;
        numbers[5] = 5;
        numbers[6] = 2;

        System.out.println("The most occurrence in this array is: "+ocurrence(numbers));

    }

    private static int ocurrence(int numbers[])
    {
        int number = numbers[0];
        int acum = 0;
        int lastAcum = 0;

        for(int i=0; i< numbers.length ; i++)
        {
            for (int j = i+1; j< numbers.length ; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    lastAcum++;
                }
            }

            if(lastAcum > acum)
            {
                number = numbers[i];
                acum   = lastAcum;
            }
        }

        return number;
    }
}
