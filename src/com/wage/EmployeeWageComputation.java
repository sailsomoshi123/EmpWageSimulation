package com.wage;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empWages = 0;
        int empHour = 0;
        double empCheck = Math.floor(Math.random() *10)%3;
        if (empCheck == IS_FULL_TIME) {
            empHour = 8;
        }
        else if (empCheck == IS_PART_TIME) {
            empHour = 4;
        }
        else {
            empHour = 0;
        }
        empWages = empHour * EMP_RATE_PER_HOUR;
        System.out.println("daily employee wage is " + empWages);
    }
}
