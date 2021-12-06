/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.administration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class UpdateTable extends SimpleTagSupport {

   private String table;
    private String newValue;  
    private String where;   
    
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();            
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            try {
                Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost/vaccineTracker?useSSL=false&allowPublicKeyRetrieval=true","nadUser","nadUserPassword");
            
                Statement update = conn.createStatement();
                update.executeUpdate("UPDATE "+table+" SET "+newValue+" WHERE "+where);
                                              
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
    
    public void setTable(String Table) {
        this.table = Table;
    }
    public void setWhere(String Where) {
        this.where = Where;
    }
    public void setNewValue(String NewValue) {
        this.newValue = NewValue;
    }
    
}
