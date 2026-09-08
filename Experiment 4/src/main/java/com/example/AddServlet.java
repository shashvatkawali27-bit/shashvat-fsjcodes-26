package com.example; 
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/add") 
public class AddServlet extends HttpServlet { 
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html"); 
int num1 = Integer.parseInt(request.getParameter("num1")); 
int num2 = Integer.parseInt(request.getParameter("num2")); 
int sum = num1 + num2; 
PrintWriter out = response.getWriter();  
out.println("<h1>Sum of two numbers " 
+ num1 + " and " + num2 + " is: " + 
sum + "</h1>"); 
} 
} 