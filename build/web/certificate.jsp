<%-- 
    Document   : certificate
    Created on : Dec 6, 2021, 1:43:18 PM
    Author     : alicia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="certification" uri="WEB-INF/tlds/certificate.tld"%>
<%@ taglib prefix="vaccination" uri="WEB-INF/tlds/update.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patients Certificate</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
       <center><h1><u>  Vaccination Certificates </u></h1></center>
         <%--<certificate:patientCertificateTag pid='1' />--%>
        <certification:certificate />
        <vaccination:update
            table="vaccinatedpatients"
            where="pid='10'"
            newValue="nin = 'NIN10NIN'"
        />
    </body>
</html>
