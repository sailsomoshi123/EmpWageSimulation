package com.wage;

public class EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_DAYS = 20;
    public static final int MAX_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {
        empWageComputation();
    }
    public static void empWageComputation() {
        System.out.println("Welcome to employee wage computation");
        int empHour = 0;
        int totalWorkingDays = 0;
        int totalEmpHours = 0;
        while ( totalEmpHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_DAYS ) {
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
        int totalEmpWages = totalEmpHours * EMP_RATE_PER_HOUR;
        System.out.println("total employee hours is " + totalEmpHours);
        System.out.println("total employee wage is " + totalEmpWages);
    }
}
