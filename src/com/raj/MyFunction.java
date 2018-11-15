package com.raj;

public interface MyFunction {
	
	public String display(String text, String text1);
	
	default String display1(String text, String text1) {
		return text1+" "+ "display1";
	}
	

}
