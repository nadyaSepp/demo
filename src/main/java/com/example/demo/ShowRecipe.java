package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShowRecipe", value = "/show-recipe")
public class ShowRecipe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Пользователь обратился к адресу /create-recipe, перенаправляем его на страницу create_recipe.jsp
        //Без смены url
        RequestDispatcher dispatcher = request.getRequestDispatcher("all_recipes.jsp");
        dispatcher.forward(request, response);
    }
}
