package homeWork;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.abs;

public class AdditionalTasks_PrimitivesLoopsArrays {
    public static void main(String[] args) {

         /*
       В переменной n хранится натуральное трёхзначное число.
       Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
        */

       int n = 211;
       int hundreds = n/100;
       int tenZero = n%100;
       int ten = tenZero/10;
       int oneUnit = n%10;
       int result = hundreds + ten + oneUnit;
        System.out.println(result);

        /*
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
         */

        double a = 10.0;
        double b = 11.45;
        if (abs(10-a) < abs(10-b)){
            System.out.println( a + " ближайшее к 10");
        }
        else{
            System.out.println(b + " ближайшее к 10");
        }


        /*
        Создать программу, выводящую на экран случайно сгенерированное трёхзначное
        натуральное число и его наибольшую цифру
         */

        int randomInt = ((int)(Math.random()*900) + 100);
        int result2 = randomInt;
        System.out.println(randomInt);
        int[] digits = new int[String.valueOf(randomInt).length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = randomInt % 10;
            randomInt = randomInt/10;
        }
        System.out.println("В числе " + result2 + " наибольшая цифра " + Arrays.stream(digits).max().getAsInt());

    }
}
