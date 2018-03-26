package com.teamtreehouse.ingredients.data;

import com.teamtreehouse.ingredients.model.Recipe;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RecipeRepository {
    private static final List<Recipe> ALL_RECIPES = Arrays.asList(
        new Recipe("recipe1", 1, LocalDate.of(2015, 2, 13), "Chris Ramacciotti", false),
        new Recipe("recipe2", 2, LocalDate.of(2015,10,30), "Ben Jakuben", true),
        new Recipe("recipe3", 3, LocalDate.of(2015,9,15), "Craig Dennis", false),
        new Recipe("recipe4", 3, LocalDate.of(2015,2,13), "Ada Lovelace", true),
        new Recipe("recipe5", 1, LocalDate.of(2015,2,13), "Grace Hopper", false),
        new Recipe("recipe6", 2, LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    public Recipe findByTitle(String title) {
        for(Recipe recipe : ALL_RECIPES) {
            if(recipe.getTitle().equals(title)) {
                return recipe;
            }
        }
        return null;
    }

    public List<Recipe> getAllRecipes() {
        return ALL_RECIPES;
    }

    public List<Recipe> findByCategoryId(int id) {
        List<Recipe> recipes = new ArrayList<>();
        for(Recipe recipe: ALL_RECIPES) {
            if(recipe.getCategoryId() == id) {
                recipes.add(recipe);
            }
        }
        return recipes;
    }
}
