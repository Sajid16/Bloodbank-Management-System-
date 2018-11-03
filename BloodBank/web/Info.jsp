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
                height: 400px;
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
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="index.jsp">Join us</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="index.jsp">Blood Bank</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="index.jsp">Hospital List</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="index.jsp">Search Donor</a></td>
                        <td style="padding:15px; padding-right: 70px;"><a style="color: black;" href="index.jsp">Admin Panel</a></td>
                    </tr>
                </table>
            </div>
            
        </header>
        <main>
            <br><br>
            <h1 style="margin-top: 80px;text-align: center;color: orange;font-family: arial;"><a name="hospital"></a>Hospital registration is here</h1>
            
            <form align="center" action="Info" method="get">
                
                <input style="text-align: center;align-items: center;height: 40px;width: 255px;margin-bottom: 20px;" type="text" name="uname" placeholder="Enter Name"><br>
                <input style="text-align: center;align-items: center;height: 40px;width: 255px;margin-bottom: 20px;" type="text" name="uadd" placeholder="Enter Address"><br>
                <input style="text-align: center;align-items: center;height: 40px;width: 255px;margin-bottom: 20px;" type="text" name="ubld" placeholder="Enter blood group"><br>
               <button style="height: 30px; width: 65px;" type="submit">Submit</button>
               
            </form>
            <hr>
            <br><br><br>
            
        </main>
        <footer>
            
        </footer>
    </body>
</html>
