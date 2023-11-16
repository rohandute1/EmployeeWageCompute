package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageCompute {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;

    private final List<CompanyEmpWage> companyEmpWageList;

    public EmployeeWageCompute() {
        this.companyEmpWageList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
    }

    public void calculateEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            int empHrs;
            int totalWorkingDays = 0;
            int totalEmpHrs = 0;

            while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) (Math.random() * 10) % 3;
                switch (empCheck) {
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
            int totalEmpWage = totalEmpHrs * companyEmpWage.empRatePerHour;
            companyEmpWage.setTotalEmpWage(totalEmpWage);
            System.out.println(companyEmpWage);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation!");
        EmployeeWageCompute empWageCompute = new EmployeeWageCompute();
        empWageCompute.addCompanyEmpWage("Bridgelabz", 25, 23, 120);
        empWageCompute.addCompanyEmpWage("DMart", 20, 20, 105);
        empWageCompute.calculateEmpWage();
    }
}

