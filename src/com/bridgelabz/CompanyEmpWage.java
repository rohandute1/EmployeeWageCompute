package com.bridgelabz;

public class CompanyEmpWage {
    private final String company;
    final int empRatePerHour;
    final int numOfWorkingDays;
    final int maxHoursPerMonth;
    int totalEmpWage;

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total employee wage for company: " + company + " is: " + totalEmpWage;
    }
}
