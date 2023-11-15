package com.bridgelabz;

public class EmployeeWageCompute {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME= 2;
    public static void calculateEmpWage(String company, int emoRatePerHour, int numOfWorkingDays, int  maxHoursPerMonth){
        int empHrs;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while(totalEmpHrs <=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch(empCheck)
            {
                case IS_PRESENT:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
        }
        int totalEmpWage = totalEmpHrs * emoRatePerHour;
        System.out.println("Total employee wage for company: " + company + "is: " + totalEmpWage);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation!");
        calculateEmpWage("Bridgelabz", 22, 24, 100);
        calculateEmpWage("Dmart", 25, 22, 80);
    }
}

