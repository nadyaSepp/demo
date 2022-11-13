package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateRecipe", value = "/create-recipe")
public class CreateRecipe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Пользователь обратился к адресу /create-recipe, перенаправляем его на страницу create_recipe.jsp
        //Без смены url
        RequestDispatcher dispatcher = request.getRequestDispatcher("create_recipe.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Пользователь нажал кнопочку и попал сюда
        //Кладем рецепт в базу данных
    }
}
