package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.CustomerApplication;

/**
 * Servlet implementation class Customer
 */
@WebServlet("/Customer")
public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
	        // Get the customer value submitted from Customer.jsp page through HttpServletRequest object
	            String name=request.getParameter("name");
	            String address=request.getParameter("address");
	            String mobile=request.getParameter("mobile");
	            String emailid=request.getParameter("emailid");
	             
	            //Set the Customer values into Customer Bean or POJO(Plain Old Java Object) class
	            com.bean.Customer customer = new com.bean.Customer();
	            customer.setName(name);
	            customer.setAddress(address);
	            customer.setMobile(Long.valueOf(mobile));
	            customer.setEmailid(emailid);
	             
	            CustomerApplication customerApplication = new CustomerApplication();
	            customerApplication.insertCustomerDetails(customer);
	            
	            RequestDispatcher dispatcher=request.getRequestDispatcher("/Welcome.jsp");
	            //Set the customer instance into request.Then only the customer object 
	            //will be available in the Welcome.jsp page
	            request.setAttribute("cust",customer);
	            dispatcher.forward(request, response);
	        } catch (ServletException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }catch(Exception e){
	            e.printStackTrace();
	        }
		
	}

}
