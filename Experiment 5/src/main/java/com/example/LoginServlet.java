package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("email");
        String password=request.getParameter("password");

        try {
            //Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userauth","root","shashvat27");
            //create statement
            Statement stmt = conn.createStatement();
            //run query
            //foor select statement
            ResultSet rs= stmt.executeQuery("SELECT * FROM `users` WHERE `email` = '"+email+"' AND  `password` = '"+password+"'");

            
            if(rs.next())
            {
                // login user
                HttpSession session = request.getSession();

                session.setAttribute("username",rs.getString("name"));
                session.setAttribute("useremail",rs.getString("email"));
                response.sendRedirect("dashboard.jsp");
            }else{
                //login incoorect
                response.sendRedirect("login.jsp?message=incorrect credentials");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error:"+e.getMessage());
        }
    }
}

