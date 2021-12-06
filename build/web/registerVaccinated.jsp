<%-- 
    Document   : registerVaccinated
    Created on : Dec 6, 2021, 12:10:31 PM
    Author     : alicia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="vaccination" uri="WEB-INF/tlds/insert.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vaccinated Patients</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
         <div class = "container">
        <div class="row">
            <div>
                <form action=" Vaccinated" method="POST">
                    <div class=" form-group">
                    <h2>Register Vaccinated Patients </h2>  
                    </div>
                    
                    <div class=" form-group">
                    <label>Health Center</label>
                    <input type="text" class=" form-controller" id ="healthcenter" name="healthcenter" placeholder=" Health Center" required>
                    </div>
                    
                    <div class=" form-group">
                    <label>First Name </label>
                    <input type="text" class=" form-controller" id ="fname" name="fname" placeholder=" First Name" required>
                    </div>
                   
                    <div class=" form-group">
                    <label>Last Name </label>
                    <input type="text" class=" form-controller" id ="lname" name="lname" placeholder=" Last Name" required>
                    </div>
                    
                    <div class=" form-group">
                    <label>Patient ID </label>
                    <input type="text" class=" form-controller" id ="pid" name="pid" placeholder=" Patient ID" required>
                    </div>
                    
                    <div class=" form-group">
                    <label>Vaccine </label>
                    <input type="text" class=" form-controller" id ="vaccine" name="vaccine" placeholder=" Vaccine " required>
                    </div>
                    
                    <div class=" form-group">
                    <label>Vaccine Batch No </label>
                    <input type="text" class=" form-controller" id ="vbn" name="vbn" placeholder=" Batch Number " required>
                    </div>
                    
                    <div class=" form-group">
                    <label>Date </label>
                    <input type="Date" class=" form-controller" id ="date" name="date" placeholder=" Date " required>
                    </div>
                    
                    <div class=" form-group">
                        <button type="submit" class="btn btn-success">Submit</button>
                    </div>
            </form>
            </div>
        
        </div>
    
    </div>
    </body>
</html>
