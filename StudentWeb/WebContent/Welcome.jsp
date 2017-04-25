<%@page import="com.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script src="js/jquery-1.12.2.min.js" type="text/javascript"></script>
        
<title>View Student Details</title>
</head>
<body bgcolor="black">
    <br><br><br><br><br><br><br><br><br>
<%
    Customer customer=(Customer)request.getAttribute("cust");
%>
<table cellspacing="10" cellpadding="10" style="border-collapse: collapse" align="center" bgcolor="orange"  border="1" width="30%">
    <tr>
        <td colspan="2" align="center"><%="Welcome "+customer.getName()+" !!!! Your details Have Been Processed." %></td>
    </tr>
    <tr>
        <td>Name </td>
        <td><%=customer.getName()%></td>
    </tr>
    <tr>
        <td>Address </td>
        <td><%=customer.getAddress() %></td>
    </tr>
    <tr>
        <td>Phone Number</td>
        <td><%=String.valueOf(customer.getMobile()) %></td>
    </tr>
    <tr>
        <td>Email Address </td>
        <td><%=customer.getEmailid() %></td>
    </tr> 
</table>
</body>
</html>