package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation!");
        final int IS_PRESENT = 1;
        int wagePerHr = 20;
        int fullDayHrs = 8;
        final int PART_TIME= 2;
        int partTimeHrs = 4;
        int partTimeEmpWage;
        int empWage;
        int random = (int)(Math.random()*10)%3;
        System.out.println(random);
        if (IS_PRESENT == random){
            empWage = fullDayHrs*wagePerHr;
            System.out.println("Employee is present and Employee Wage per day : "+ empWage);
        }
        else if(PART_TIME==random){
            partTimeEmpWage = wagePerHr * partTimeHrs;
            System.out.println("Employee is part time and Employee Wage per day : "+ partTimeEmpWage);
        }
        else {
            System.out.println("Employee is absent.");
        }
    }
}