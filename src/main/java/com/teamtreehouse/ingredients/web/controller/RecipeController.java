package com.teamtreehouse.ingredients.web.controller;

import com.teamtreehouse.ingredients.data.RecipeRepository;
import com.teamtreehouse.ingredients.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Recipe> allRecipes = recipeRepository.getAllRecipes();
        modelMap.put("recipes",allRecipes);
        return "home";
    }

    @RequestMapping("/recipe/{title}")
    public String recipeDetails(@PathVariable String name, ModelMap modelMap) {
        Recipe recipe = recipeRepository.findByTitle(name);
        modelMap.put("recipe",recipe);
        return "recipe-details";
    }
}