package com.workforce.hr;

import java.util.ArrayList;

/**
 * Created by benjamin on 6/19/15.
 */
public class Manager extends Employee{
    // '<>' is a generix.  It lets you... he never told us :(

    private ArrayList reports = new ArrayList();

    public void addEmployee(int ID){
    //adds employee
        reports.add(ID);

    }

    public void removeEmployee(int ID){
    //Reomve employee from the report
            if (reports.indexOf(ID) > -1) {
                reports.remove(reports.indexOf(ID));
            }





    }
}
