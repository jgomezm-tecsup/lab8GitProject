package com.tecsup.lab8.main;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String str = "Hello!";

		App appObject = new App();
		System.out.println("The reverse string of \"" + str + "\" is \"" + appObject.reverseString(str) + "\"");

		// nuevo comentario
		
		System.out.println("jgomezz");
		
		// Nuevo Cambio
		System.out.println("cambio desde el usuario jgomezz");


		
		// Fin de proceso
		end();

		//
		procesar();
		
	}

	private static void end() {
		// TODO Auto-generated method stub

	}

	private static void procesar() {
		// TODO Auto-generated method stub
		
	}

	public String reverseString(String src) {
		return new StringBuilder(src).reverse().toString();
	}

	
	
	
	private void miFunction() {
		// TODO Auto-generated method stub

	}
}


