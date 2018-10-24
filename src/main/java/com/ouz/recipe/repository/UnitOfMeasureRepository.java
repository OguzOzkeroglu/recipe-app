package com.ouz.recipe.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ouz.recipe.model.UnitOfMeasure;

/**
 * @author oguz, created on 2018.10.24
 *
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	Optional<UnitOfMeasure> findByDescription(String description);
}
