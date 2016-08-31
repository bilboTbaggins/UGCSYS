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

/**
 *
 * @author Pudji
 */
public class ConsultationQueries {
    
    public void insertConsultation (Consultation toInsert) {
        int returnValue = -1;
        try {
            PreparedStatement insertConsultation = conn.prepareStatement(
                    "insert into app.consultation (idconsultation, student_id, consulationdescription, consulationdate, consulationtime, consulationpriority, consulationreason) values (?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            insertConsultation.setString(1, toInsert.getIdConsultation());
            insertConsultation.setString(2, toInsert.getStudent_id());
            insertConsultation.setString(3, toInsert.getConsulationDescription());
            insertConsultation.setString(4, toInsert.getConsulationDate());
            insertConsultation.setString(5, toInsert.getConsulationTime());
            insertConsultation.setString(6, toInsert.getConsulationPriority());
            insertConsultation.setString(7, toInsert.getConsulationReason());
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
        return returnValue;
    }
}
