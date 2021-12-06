<%-- 
    Document   : vaccinated
    Created on : Dec 6, 2021, 1:43:48 PM
    Author     : alicia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="vaccination" uri="WEB-INF/tlds/select.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vaccinated Patients</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
    <center><h3>All Vaccinated</h3></center>
     <%--<vaccination:select table="vaccinatedpatients" displayFormat="table" where="pid='1'" />--%>
        <vaccination:select table="vaccinatedpatients" displayFormat="table" />
    </body>
</html>
