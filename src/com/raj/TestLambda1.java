package com.raj;

import java.util.Comparator;

public class TestLambda1 {

	public static void main(String[] args) {
		Comparator<String> stringComparatorLambda = (o1, o2) ->o1.compareTo(o2);
		System.out.println(stringComparatorLambda.compare("raj1", "raj"));
		
		//below is implementation using abstract 
		MyFunctionExtended functionExtend = new MyFunctionExtended();
		String name = functionExtend.display("my name is ", "john");
		System.out.println(name);
		
		//below is implementation using lambda
		MyFunction function = (text, text1)-> {
			return text+ " "+text1;};
			System.out.println(function.display(" john ", " is great "));
		
	}
	

}
