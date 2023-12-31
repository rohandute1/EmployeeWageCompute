package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

interface EmpWageBuilder {
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void calculateEmpWage();
}
public class EmployeeWageCompute implements EmpWageBuilder {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;

    private final List<CompanyEmpWage> companyEmpWageList;

    public EmployeeWageCompute() {
        this.companyEmpWageList = new ArrayList<>();
    }
    @Override
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
    }

    @Override
    public void calculateEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            int empHrs;
            int totalWorkingDays = 0;
            int totalEmpHrs = 0;

            while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int)(Math.random() * 10) % 3;
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
        EmpWageBuilder empWageBuilder = new EmployeeWageCompute();
        empWageBuilder.addCompanyEmpWage("Bridgelabz", 25, 23, 120);
        empWageBuilder.addCompanyEmpWage("DMart", 20, 20, 105);
        empWageBuilder.addCompanyEmpWage("TATA",26,21,192);
        empWageBuilder.calculateEmpWage();
    }
}

