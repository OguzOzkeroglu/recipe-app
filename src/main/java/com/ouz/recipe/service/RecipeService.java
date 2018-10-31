package com.ouz.recipe.service;

import java.util.Set;

import com.ouz.recipe.model.Recipe;

/**
 * @author oguz, created on 2018.10.31
 *
 */

public interface RecipeService {
	Set<Recipe> getRecipes();
}
