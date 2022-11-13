package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.models.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Register", value = "/register")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(UserDAO.getInstance().register(new User(email, password))) {
            response.sendRedirect("auth");
            System.out.println("Success");
        }
        else {
            response.sendRedirect("register");
            System.out.println(":(");
        }
    }
}
