package com.ouz.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.ouz.recipe.model.Category;

/**
 * @author oguz, created on 2018.10.24
 *
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
