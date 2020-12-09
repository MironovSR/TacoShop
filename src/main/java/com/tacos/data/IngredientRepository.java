package com.tacos.data;

import com.tacos.Ingredient;

public interface IngredientRepository {

	Iterable<Ingredient> findAll();
	
	Ingredient findOne(String one);
	
	Ingredient save(Ingredient ingredient); 
}
