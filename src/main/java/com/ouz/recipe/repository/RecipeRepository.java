package com.ouz.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.ouz.recipe.model.Recipe;

/**
 * @author oguz, created on 2018.10.24
 *
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
