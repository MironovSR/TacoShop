package com.tacos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

//@Data
public class Taco {
	
	@Getter
	@Setter
	private Long id;
	
	@Getter
	@Setter
	private Date createdAt;
	
	@Getter
	@Setter
	@NonNull
	@Size(min = 5, message = "At least 5 characters is needed!")
	private String name;

	@Getter
	@Setter
	@Accessors
	@Size(min = 1, message = "At At least 1 characters is needed!")
	private List<String> ingredients;
}
