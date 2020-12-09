package com.tacos;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {

	private final @NonNull String id;
	private final @NonNull String name;
	private final @NonNull Type type;
	
	public static enum Type {
		WRAP, PROTEIN, VEGGIES,CHEESE, SAUCE
	};
}
