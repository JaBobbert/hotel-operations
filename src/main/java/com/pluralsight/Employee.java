package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int employeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String department() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double hoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double payRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getRegularHours(){
        if (hoursWorked <= 40){
            return hoursWorked;
        }
        else {
            return 40;
        }
    }

    public double getOvertimeHours(){
        if (hoursWorked > 40){
            return (hoursWorked-40);
        }
        else {
            return 0;
        }
    }

    public double getTotalPay(){
        if (hoursWorked <= 40){
            return getRegularHours() * payRate;
        }
        else {
            return (hoursWorked-40)*(payRate*1.5) + (40*payRate);
        }

    }

    @Override
    public String toString() {
        return name + " " + employeeId + " " + department;
    }
}

