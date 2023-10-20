package com.bridgelabz;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation!");
        final int IS_PRESENT = 1;
        final int PART_TIME= 2;
        int wagePerHr = 20;
        int empHrs = 0;
        int empWage;
        int totalEmpWage;
        int max_Working_Hrs = 100;
        int max_Working_Days = 20;
        int totalEmpHrs = 0;
        int day=1;

        while(day<=max_Working_Days && totalEmpHrs < max_Working_Hrs)
        {
            int random = (int)(Math.random()*10)%3;
            switch(random)
            {
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
            totalEmpHrs += empHrs;
            System.out.println("Employee wage per day is : "+ empWage);
            day++;
        }
        int totalHrs = totalEmpHrs;

        if (totalEmpHrs>100){
            totalHrs = totalEmpHrs-4;
        }
            totalEmpWage = wagePerHr * totalHrs;
            System.out.println("Total employee wage for "+(day-1)+" days and "+totalHrs+" Hrs is: "+totalEmpWage);
    }
}