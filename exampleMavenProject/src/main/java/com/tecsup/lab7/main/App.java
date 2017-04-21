package com.tecsup.lab7.main;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String str = "Hello!";

		App appObject = new App();
		System.out.println("The reverse string of \"" + str + "\" is \"" + appObject.reverseString(str) + "\"");

	}

	public String reverseString(String src) {
		return new StringBuilder(src).reverse().toString();
	}

}
