/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author Pudji
 */
public class StudentQueries extends DatabaseConnection {
    
    public void insertStudent (Student toInsert) {
        int returnValue = -1;
        try {
            PreparedStatement insertStudent = conn.prepareStatement(
                    "insert into app.consultation (idstudent, studentz, "
                            + "studentfname, studentsname, studentDOB, "
                            + "studentprogram, studentmajor, studentstartyear, "
                            + "studentprevious) values (?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            insertStudent.setInt(1, toInsert.getId());
            insertStudent.setString(2, toInsert.getStudentZID());
            insertStudent.setString(3, toInsert.getFName());
            insertStudent.setString(4, toInsert.getLName());
            insertStudent.setString(5, toInsert.getDateOB());
            insertStudent.setString(6, toInsert.getProgram());
            insertStudent.setString(7, toInsert.getMajor());
            insertStudent.setInt(8, toInsert.getStartYear());
            insertStudent.setInt(9, toInsert.getNoOfPreviousConsul());
            insertStudent.executeUpdate();
            ResultSet rs = insertStudent.getGeneratedKeys();
            rs.next();
            returnValue = rs.getInt(1);
            rs.close();
            insertStudent.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();
        
    }
    
    public List<Student> getStudent() {
        List<Student> shows = new ArrayList<Student>();
        openConnection();
        try {
            PreparedStatement getAllShows = conn.prepareStatement(
                    "select * from app.student");
            ResultSet rs = getAllShows.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt("idstudent"), 
                        rs.getString("studentz"), rs.getString("studentfname"), 
                        rs.getString("studentlname"), rs.getString("studentDOB"), 
                        rs.getString("studentprogram"), rs.getString("studentmajor"), 
                        rs.getInt("studentstartyear"), rs.getInt("studentprevious"));
                shows.add(student);
            }
            rs.close();
            getAllShows.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();
        return shows;
    }
}

