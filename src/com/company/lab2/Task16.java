package com.company.lab2;

import java.util.Scanner;

/**
 * Created by наш on 28.03.2017.
 */
public class Task16 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner x = new Scanner(System.in);
        System.out.println("Select x:");
        a = x.nextInt();
        System.out.println("Select y:");
        b = x.nextInt();
        double c = -5 * Math.sqrt (a+Math.sqrt(b));
        System.out.format("%4f%n",c); // непонятно почему пишит 6 знаков вмексто 4
    }
}
