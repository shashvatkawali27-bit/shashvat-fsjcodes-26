package com.example; 
import java.io.IOException;
import java.io.PrintWriter;
 
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/welcome") 
public class WelcomeServlet extends GenericServlet { 
public void service(ServletRequest request, ServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html"); 
String myname = request.getParameter("myname"); 
PrintWriter out = response.getWriter(); 
out.println("<h1>Welcome "+ myname +"</h1>"); 
} 
}
