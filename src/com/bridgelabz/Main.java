package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation!");
        final int IS_PRESENT = 1;
        final int PART_TIME= 2;
        int wagePerHr = 20;
        int empHrs = 0;
        int empWage;

        int random = (int)(Math.random()*10)%3;
        switch(random){
            case IS_PRESENT:
                empHrs = 8;
                System.out.println("Employee is present full day.");
                break;
            case PART_TIME:
                empHrs = 4;
                System.out.println("Employee is half day present.");
                break;
            default:
                System.out.println("Employee is absent.");
                break;
        }
        empWage = wagePerHr * empHrs;
        System.out.println("Employee wage per day is : "+ empWage);
    }
}