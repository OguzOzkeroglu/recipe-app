package com.ouz.recipe.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.ouz.recipe.model.Recipe;
import com.ouz.recipe.service.RecipeService;

/**
 * @author oguz, created on 2018.11.09
 *
 */

public class IndexControllerTest {
	@Mock
	RecipeService recipeService;

	@Mock
	Model model;

	IndexController controller;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		controller = new IndexController(recipeService);
	}

	@Test
	public void testGetIndexPage() {
		// given
		Set<Recipe> recipes = new HashSet<>();
		recipes.add(new Recipe());
		recipes.add(new Recipe());

		when(recipeService.getRecipes()).thenReturn(recipes);

		@SuppressWarnings("unchecked")
		ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

		// when
		String viewName = controller.getIndexPage(model);

		// then
		assertEquals("index", viewName);
		verify(recipeService, times(1)).getRecipes();
		verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
		Set<Recipe> setInController = argumentCaptor.getValue();

		assertEquals(2, setInController.size());
	}
}
