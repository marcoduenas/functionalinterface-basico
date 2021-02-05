package funcionalinterfacebasico.operadores;

import java.util.function.BiFunction;

public class BiFunction_Example {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> biFunction = (a,b) -> (a+b).length() ;
		
		System.out.println(biFunction.apply("Basics", "Strong"));

	}
	
}
