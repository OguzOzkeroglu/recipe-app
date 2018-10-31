package com.ouz.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ouz.recipe.service.RecipeService;

/**
 * @author oguz, created on 2018.10.08
 *
 */
@Controller
public class IndexController {
	private RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());

		return "index";
	}
}
