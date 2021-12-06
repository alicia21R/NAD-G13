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
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author alicia
 */
public class certificate extends SimpleTagSupport {

   	public void doTag() throws JspException, IOException {
            JspWriter out = getJspContext().getOut();
            
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            try {
                Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost/vaccineTracker?useSSL=false&allowPublicKeyRetrieval=true","nadUser","nadUserPassword");
            
                Statement readAll = conn.createStatement();
                ResultSet rs = readAll.executeQuery("SELECT * FROM vaccinatedpatients");               
                
                while(rs.next()){
                    out.println("<h3>Certificate for patient with ID "+rs.getString(4)+"</h3>");
                    out.println("<p>This is to certfy that "+rs.getString(2)+" "+rs.getString(3)+",</p>");
                    out.println("<p>with a National ID Number "+rs.getString(8)+",</p>");
                    out.println("<p>received "+rs.getInt(9)+" dose(s) of "+rs.getString(5)+",</p>");
                    out.println("<p>on "+rs.getDate(7)+" at "+rs.getString(1)+" Health Centre.</p>");
                }  
                
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
