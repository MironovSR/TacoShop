package com.tacos;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Order {

	@NotBlank(message="Name is requied")
	private String name;
	
	@NotBlank(message = "Street is requied")
	private String street;
	
	@NotBlank(message = "City is requied")
	private String city;
	
	@NotBlank(message = "State is requied")
	private String state;
	
	@NotBlank(message = "Zip code is requied")
	private String zip;
	
	@CreditCardNumber(message = "Insert a valid credit card number! Or you will be doomed!")
	private String ccNumber;
	
	@Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = " Wrong format data!")
	private String ccExpiration;
	
	@Digits(integer=3, fraction=0, message="Invalid CVV")
	private String ccCVV;
}
