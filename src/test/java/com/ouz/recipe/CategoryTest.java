package com.ouz.recipe;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.ouz.recipe.model.Category;
import com.ouz.recipe.model.Recipe;

/**
 * @author oguz, created on 2018.11.08
 *
 */

public class CategoryTest {

	Category category;

	@Before
	public void setUp() {
		category = new Category();
	}

	@Test
	public void testGetId() {
		Long id = 5L;
		category.setId(id);

		assertEquals(id, category.getId());
	}

	@Test
	public void testGetDescription() {
		String description = "Any description for test..";
		category.setDescription(description);

		assertEquals(description, category.getDescription());
	}

	@Test
	public void testGetRecipes() {
		Recipe recipe = new Recipe();
		recipe.setId(5L);

		Set<Recipe> recipes = new HashSet<>();

		recipes.add(recipe);

		category.setRecipes(recipes);

		assertEquals(recipes, category.getRecipes());
	}
}
