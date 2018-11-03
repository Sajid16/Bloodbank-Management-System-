<%-- 
    Document   : Search
    Created on : Sep 24, 2018, 4:43:31 AM
    Author     : sajid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <h1 style="text-align: center;">Search for Donor</h1>
        <form method="get" action="Search">
            <input style="margin-left: 43%;" type="text" name="search"><br><br>
            <button style="margin-left: 47%" type="submit">Search</button>
            
        </form>
    </body>
</html>
