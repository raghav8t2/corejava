package com.learning.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionInterfaceImpl1 {

	static Function<String, String> uppercaseFunction = (input) -> input.toUpperCase();
	static Function<String, String> concatFunction = (input) -> "This is "+ input;
	
	public static void main(String[] args) {
		System.out.println(uppercaseFunction.apply("Function interface example."));
		
		System.out.println(concatFunction.apply("Function interface example."));

		System.out.println(concatFunction.andThen(uppercaseFunction).apply("Function interface example."));
		
		System.out.println(concatFunction.compose(uppercaseFunction).apply("Function interface example."));
	}

}
