/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

//import employeeproject.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Consultation;

/**
 *
 * @author Pudji
 */
public class ConsultationQueries extends DatabaseConnection {
    
    public void insertConsultation (Consultation toInsert) {
        int returnValue = -1;
        try {
            PreparedStatement insertConsultation = conn.prepareStatement(
                    "insert into app.consultation (idconsultation, student_id, consulationdescription, consulationdate, consulationtime, consulationpriority, consulationreason) values (?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            insertConsultation.setInt(1, toInsert.getId());
            insertConsultation.setInt(2, toInsert.getStudent());
            insertConsultation.setString(3, toInsert.getDescription());
            insertConsultation.setString(4, toInsert.getDate());
            insertConsultation.setString(5, toInsert.getTime());
            insertConsultation.setString(6, toInsert.getPriority());
            insertConsultation.setString(7, toInsert.getReason());
            insertConsultation.executeUpdate();
            ResultSet rs = insertConsultation.getGeneratedKeys();
            rs.next();
            returnValue = rs.getInt(1);
            rs.close();
            insertConsultation.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();
        
    }
}
