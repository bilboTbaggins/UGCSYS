/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Pudji
 */
public class Student {
    int id;
    String studentZID;
    String fName;
    String lName;
    Date dateOB;
    String program;
    String major;
    String startYear;
    int noOfPreviousConsul;
    
    public Student(int id, String studentZID, String fname, String lname, Date dOB, 
            String prog, String major, String sYear, int previous) {
        this.id = id;
        this.studentZID = studentZID;
        this.fName = fname; 
        this.lName = lname;
        this.dateOB = dOB;
        this.program = prog;
        this.major = major;
        this.startYear = sYear;
        this.noOfPreviousConsul = previous;       
    }
    
    public int getID () {
        return id;
    }
}
