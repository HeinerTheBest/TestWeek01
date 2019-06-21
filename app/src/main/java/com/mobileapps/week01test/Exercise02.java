package com.mobileapps.week01test;

public class Exercise02
{
    /*
       2. Simple Java Program to check or find if a number is Armstrong number or not.
        An Armstrong number of three digit is a number whose sum of cubes of its digit is equal
         to its number.
         For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or 1+125+27=153
    * */

    public static void main(String[] args) {
        int number = 153;

        if(isArnstrong(number))
        {
            System.out.println("The number "+number+" is Armstrong");
        }
        else
        {
            System.out.println("The number "+number+" is not Armstrong");
        }
    }

    static private boolean isArnstrong(int n)
    {
        int n01 = n/100;
        int n02 = (n-(n01*100))/10;
        int n03 = n-(n01*100)-(n02*10);

        n01=n01*n01*n01;
        n02=n02*n02*n02;
        n03=n03*n03*n03;

        int total = n01+n02+n03;

        return total == n;
    }
}
