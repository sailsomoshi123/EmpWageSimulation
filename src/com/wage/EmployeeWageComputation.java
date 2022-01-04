package com.wage;

public class EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
                empWageComputation("dmart",20,10,10);
                empWageComputation("tcs",20,20,100);
    }
    public static int empWageComputation(String company, int empRatePerHour, int numOfWorkingDays,int maxHourPerMonth) {
        System.out.println("Welcome to employee wage computation");
        int empHour = 0;
        int totalWorkingDays = 0;
        int totalEmpHours = 0;
        while ( totalEmpHours <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays ) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() *10)%3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHour = 8;
                    break;
                case IS_PART_TIME:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;
            }
            System.out.println("day : " + totalWorkingDays + " emp hour : " + empHour );
            totalEmpHours+= empHour;
        }
        int totalEmpWages = totalEmpHours * empRatePerHour;
        System.out.println("total employee wage for company: " +company +" is: "+totalEmpWages);
        return totalEmpWages;
    }
}
