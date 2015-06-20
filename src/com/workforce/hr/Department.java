package com.workforce.hr;

/**
 * We want the department to run bonuses...
 *6/19/15.
 */
public class Department {
    private String name;

    private Employee employee[] = null;
    private Manager managers [] = null;


    //Passing an argument to the constructor means
    public Department(String name){
        this.name = name;
    }
    public void calculateBonuses(){
        //Calculate the bonuses of all the individuals (Employees and Managers) for this department


    }

    public void calculateVacationDays(){
        //Calculate the vacation days of all the people working for this department
    }
}
