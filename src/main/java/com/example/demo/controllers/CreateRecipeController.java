package com.example.demo.controllers;

import com.example.demo.models.Recipe;
import com.example.demo.models.RecipeDAO;
import com.example.demo.models.User;
import com.example.demo.models.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateRecipe", value = "/create-recipe")
public class CreateRecipeController extends HttpServlet {
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
        //DAO data access object
        //UserDAO
        //RecipeDAO
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String email = (String) request.getSession().getAttribute("user");
        User author = UserDAO.getInstance().getUserByEmail(email);
        Recipe recipe = new Recipe(title, description, author);
        System.out.println(author);
        RecipeDAO.getInstance().insert(recipe);
        response.sendRedirect("/");
    }
}
