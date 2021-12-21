package com.company;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] myArray;
        myArray = new double [15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ((double) (Math.random()*40) -20);
            System.out.println(myArray[i]);
        }
        double  maxNum = myArray[0];
        double minNum = myArray[0];
        for (double j : myArray) {
            if (j > maxNum) {
                maxNum = j;
            }
            if (j < minNum) {
                minNum = j;
            }
        }
        System.out.println("максимальный элемент: " + maxNum + ", минимальный элемент " + minNum);
        System.out.println("наибольшее по модулю из минимального и максимального: " + Math.max(Math.abs(maxNum), Math.abs(minNum)));
    }
}


