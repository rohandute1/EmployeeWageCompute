package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation!");
        final int IS_PRESENT = 1;
        int random = (int)(Math.random()*10)%2;
        //System.out.println(random);
        if (random == IS_PRESENT){
            System.out.println("Employee is present.");
        }
        else {
            System.out.println("Employee is absent.");
        }
    }
}