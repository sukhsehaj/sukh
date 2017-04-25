<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Student Details</title>
        <script src="js/jquery-1.12.2.min.js" type="text/javascript"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700,100' rel='stylesheet' type='text/css'>
        <link href="css/style.css" rel="stylesheet">    
       
    </head>

    <body style="background-color: black">
       
    <center>
        <form action="Customer" method="post" >
            <br>
                <table>
                    <h1 style="color: orange">PLEASE ENTER STUDENT DETAILS</h1>   
                    <tr><td><div class="form-group">
                                <label>Name</label>
                                <input type="text" style="text-align: center" class="form-control" placeholder="Name" required name="name">
                            </div>
                        </td>
                    </tr>

                    

                    <tr><td><div class="form-group">
                                <label>Address</label>
                                <input type="text" style="text-align: center" class="form-control" placeholder="Address" required name="address" >
                            </div>
                        </td>
                    </tr>

                    <tr><td><div class="form-group">
                                <label>Phone No</label>
                                <input type="text" style="text-align: center" class="form-control" name="mobile" placeholder="Phone Number" required maxlength="10">
                            </div>
                        </td>
                    </tr>

                    <tr><td><div class="form-group">
                                <label>Email Address</label>
                                <input type="email" style="text-align: center" class="form-control" name="emailid" placeholder="Email Addrress" required>
                            </div>
                        </td>
                    </tr> 

                    <tr><td><div class="form-group">
                                <input class="form-control btn-primary" type="submit" value="Submit" >
                            </div>
                             </td>
                    </tr>



                </table>            
        </form>
         
    </center>
    </body>
</html>