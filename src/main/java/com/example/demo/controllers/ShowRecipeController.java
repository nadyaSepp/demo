package com.example.demo.controllers;

import com.example.demo.models.Recipe;
import com.example.demo.models.RecipeDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowRecipe", value = "/show-recipe")
public class ShowRecipeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("prefUser");
        String recipe = request.getParameter("prefRecipe");
        System.out.println("get: " + user + " " + recipe);
        if (!user.isEmpty() || !recipe.isEmpty()) {
            List<Recipe> recipeList = RecipeDAO.getInstance().searchPrefRecipe(recipe,user);
            request.setAttribute("recipes", recipeList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("all_recipes.jsp");
            dispatcher.forward(request, response);
        }
        else {
            //Пользователь обратился к адресу /all_recipes, перенаправляем его на страницу create_recipe.jsp
            //Без смены url
            List<Recipe> recipeList = RecipeDAO.getInstance().allRecipes();
            request.setAttribute("recipes", recipeList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("all_recipes.jsp");
            dispatcher.forward(request, response);
        }

    }
}
