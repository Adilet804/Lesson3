package com.company;

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
    }
}