package com.example.demo.controllers;

import com.example.demo.models.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Auth", value = "/auth")
public class AuthController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Перенаправляем на jsp страничку с авторизацией
        RequestDispatcher dispatcher = request.getRequestDispatcher("auth.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(UserDAO.getInstance().login(email, password)) {
            request.getSession().setAttribute("user", email);
            response.sendRedirect("/");
        }
    }
}
