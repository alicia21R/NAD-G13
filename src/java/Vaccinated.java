/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alicia
 */
public class Vaccinated extends HttpServlet {
    //    connecting to the database
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1; 
 
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/vaccineTracker?useSSL=false&allowPublicKeyRetrieval=true","nadUser","nadUserPassword");
            
            String healthcenter =request.getParameter("healthcenter");
            String fname =request.getParameter("fname");
            String lname =request.getParameter("lname");
            String patientid=request.getParameter("pid");
            String vaccine = request.getParameter("vaccine");
            String batchNo = request.getParameter("vbn");
            String date = request.getParameter("date");
            out.println(1111111);
            
            pst=con.prepareStatement ("insert into vaccinatedpatients(healthcenter,firstname,lastname,pid,vaccine,batchNo,dob)values(?,?,?,?,?,?)");
            pst.setString(1, healthcenter);
            pst.setString(2, fname);
            pst.setString(3, lname);
            pst.setString(4, patientid);
            pst.setString(5, vaccine);
            pst.setString(6, batchNo);
            pst.setString(7,date);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            out.println(ex);
        } catch (ClassNotFoundException ex) {
            out.println(ex);
        }
    }
    }

   


