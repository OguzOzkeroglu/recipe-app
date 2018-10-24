package com.ouz.recipe.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ouz.recipe.model.Category;
import com.ouz.recipe.model.UnitOfMeasure;
import com.ouz.recipe.repository.CategoryRepository;
import com.ouz.recipe.repository.UnitOfMeasureRepository;

/**
 * @author oguz, created on 2018.10.08
 *
 */
@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({"", "/", "/index"})
	public String getIndexPage() {
		
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Category id is : " + categoryOptional.get().getId());
		System.out.println("UnitOfMeasure id is : " + unitOfMeasureOptional.get().getId());
		
		return "index";
	}
}
