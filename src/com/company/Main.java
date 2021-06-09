package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.5, 5.5, -4.3, 3.6, -7.9, 9.7, 12.4, 23.2, -13.1, 18.5, 7.7, -10.3, 16.5, 14.8, -22.4};
        double sum = 0.0;
        int kol = 0;
        boolean isPositive = false;
        for (double numbers : array) {
            if (numbers < 0) {
                isPositive = true;
            } else if (isPositive) {
                sum = sum + numbers;
                kol++;
            }
        }
        double result = sum / kol;
        System.out.println("Результат: " + result);

        double [] mas ={12.4,45.8,-65.24,34.63,-76.32,63.42,84.23,61.38,-30.12,80.46,90.65,38.23,13.2,45.32,85.18};
        boolean isSorted = false;
        double buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
}