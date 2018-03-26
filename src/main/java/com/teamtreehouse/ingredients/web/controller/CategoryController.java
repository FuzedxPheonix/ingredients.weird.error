package com.teamtreehouse.ingredients.web.controller;

import com.teamtreehouse.ingredients.data.CategoryRepository;
import com.teamtreehouse.ingredients.data.RecipeRepository;
import com.teamtreehouse.ingredients.model.Category;
import com.teamtreehouse.ingredients.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findById(id);
        modelMap.put("category",category);

        List<Recipe> recipes = recipeRepository.findByCategoryId(id);
        modelMap.put("recipes",recipes);

        return "category";
    }
}