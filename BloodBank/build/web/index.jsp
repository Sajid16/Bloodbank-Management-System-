<%-- 
    Document   : index
    Created on : Aug 24, 2018, 6:11:23 PM
    Author     : sajid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood_Bank</title>
        <style>
            header{
                width: 100%;
                height: 210px;
                background-color: #984B43;
            }
            main{
                width: 100%;
                height: 450px;
                background-color: #233237;
            }
            footer{
                width: 100%;
                height: 150px;
                background-color: #984B43;
            }
            .logo{
                height: 130px;
            }
            .menu table tr:hover{
                color: orange;
            }
            
        </style>
    </head>
    <body>
        <header>
            <div class="logo">
                <img src="logo.png">
                <img style="float:right; padding-left: 3px;" src="banner1.png">
            </div>
            
            <div class="menu">
                <table style="display: inline-block;
                              font-family:  serif;
                              font-size: 25px;
                              margin-right: 15px;
                              font-weight: bold;">
                    <tr>
                        <td style="padding:15px; padding-right: 70px; padding-left: 100px;"><a style="color: black;" href="index.jsp">Home</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="Registration.jsp">Join us</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="Info.jsp">Blood Bank</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="index.jsp">Hospital List</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="Search.jsp">Search Donor</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="index.jsp">Admin Panel</a></td>
                    </tr>
                </table>
            </div>
            
        </header>
        <main>
                <h1 style="color: orange;padding-top: 55px;margin-left: 55px;">Welcome to Blood Bank!</h1>
                <h4 style="color: orange;margin-left: 55px;">Welcome to Blood Bank!</h4>
                
                <span><h1 style="color: orange;font-weight: bold;text-align: center;margin-top: -100px;margin-left: -80px;;">Services....</h1></span>
                <ul style="color: orange;font-style: italic;margin-left: 530px;">
                    <li>Blood Bank</li>
                    <li>Donors information</li>
                    <li>Hospital wise information</li>
                </ul>
                
                <form method="get" action="LogIn">
                    <span><h1 style="color: orange;font-weight: bold;text-align: right;margin-top: -125px;margin-right: 150px;">Log In is</h1></span>
                    <span><h1 style="color: orange;font-weight: bold;text-align: right;margin-top: -25px;margin-right: 150px;margin-bottom: 100px;"> here........</h1></span>
                    <input style="float:right; margin-right: 30px; height: 30px; width: 300px;margin-top: -25px;" type="text" name="uname" placeholder="User Name">
                    <input style="float:right; margin-right: 30px; height: 30px; width: 300px;margin-top: 50px;margin-right:-305px;" type="password" name="upass" placeholder="User Password"><br><br><br><br><br>
                    <button style="height: 30px; float: right; width: 65px;margin-top: 35px;margin-right: 25px;" type="submit">LogIn</button>
                </form>
        </main>
        <footer>
            
        </footer>
    </body>
</html>
