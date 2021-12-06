/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.administration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author alicia
 */
public class progress extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            try {
                Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost/vaccineTracker?useSSL=false&allowPublicKeyRetrieval=true","nadUser","nadUserPassword");
            
                Statement countStatement = conn.createStatement();
                
                ResultSet rs1 = countStatement.executeQuery("SELECT COUNT(*) FROM Bookings");                
                rs1.next();
                int count1 = rs1.getInt(1); 
                
                ResultSet rs2 = countStatement.executeQuery("SELECT COUNT(*) FROM Vaccinated_Patients");
                rs2.next();
                int count2 = rs2.getInt(1);
                
                out.println("Total Bookings: "+count1);
                out.println("<br />Total Vaccinated: "+count2); 
                out.println("<br />Progress: "+(count2/count1)*100+"%<br />");                
                                              
                conn.close();
                
            } catch (SQLException ex) {
                out.println("SQLException: " + ex.getMessage());
                out.println("<br />SQLState: " + ex.getSQLState());
                out.println("<br />VendorError: " + ex.getErrorCode());
            }            
        } catch (ClassNotFoundException ex) {
            out.println("Error: Class '"+ex.getMessage()+"' not found");
        }
    }  
    }
    

