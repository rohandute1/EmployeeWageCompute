package com.bridgelabz;

public class EmployeeWageCompute {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME= 2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    int totalEmpWage;
    public EmployeeWageCompute(String company, int emoRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        this.company = company;
        this.empRatePerHour = emoRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void calculateEmpWage(){
        int empHrs;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
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
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }
    @Override
    public String toString(){
        return "Total employee wage for company: " + company + " is: " + totalEmpWage;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation!");
        EmployeeWageCompute bridgeLabz = new EmployeeWageCompute("Bridgelabz",25,23, 120);
        EmployeeWageCompute dMart = new EmployeeWageCompute("DMart",20,20, 105);
        dMart.calculateEmpWage();
        System.out.println(dMart);
        bridgeLabz.calculateEmpWage();
        System.out.println(bridgeLabz);
    }
}

