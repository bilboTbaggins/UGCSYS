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
    String dateOB;
    String program;
    String major;
    int startYear;
    int noOfPreviousConsul;
    
    //Constructor
    public Student(int id, String studentZID, String fname, String lname, String dOB, 
            String prog, String major, int sYear, int previous) {
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
    
    public int getId() {
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getStudentZID() {
        return studentZID;
    }
    
    public void setStudentZID(String sZID) {
        this.studentZID = sZID;
    }
    
    public String getFName() {
        return fName;
    } 
    
    public void setFName(String fname) {
        this.fName = fname;
    }
    
    public String getLName() {
        return lName;
    } 
    
    public void setLName(String lname) {
        this.lName = lname;
    }
    
    public String getDateOB() {
        return dateOB;
    } 
    
    public void setDateOB(String dob) {
        this.dateOB = dob;
    }
    
    public String getProgram() {
        return program;
    } 
    
    public void setProgram(String prog) {
        this.program = prog;
    }
    
    public String getMajor() {
        return major;
    } 
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public int getStartYear() {
        return startYear;
    } 
    
    public void setStartYear(int sYear) {
        this.startYear = sYear;
    }
    
    public int getNoOfPreviousConsul() {
        return noOfPreviousConsul;
    } 
    
    public void setNoOfPreviousConsul(int previous) {
        this.noOfPreviousConsul = previous;
    }
    
}
