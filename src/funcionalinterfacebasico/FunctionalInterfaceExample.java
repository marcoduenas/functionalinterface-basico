package funcionalinterfacebasico;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import model.Persona;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.- PREDICATE - EVALUA Y REGRESA BOOLEAN
		Predicate<String> checkLength = str -> str.length() > 5;
		System.out.println(checkLength.test("Esteban"));

		// 2.- CONSUMER - MODIFICA LA DATA - SOLO INPUT NO OUTPUT
		Persona persona = new Persona();

		Consumer<Persona> setName = p -> p.setName("Marco Dueñas");
		setName.accept(persona);

		System.out.println(persona.getName());

		// 3.- FUNCTION - RECIBE INPUT Y GENERA OUTPUTÇ
		Function<Integer, String> getInt = t -> t + " multiplicada por 10 = " + (t * 10) ;

		System.out.println(getInt.apply(20));

		// 4.- SUPPLIER - GENERA LA DATA - NO INPUT SOLO OUTPUT
		Supplier<Double> getRandomDouble = () -> Math.random();
		System.out.println(getRandomDouble.get());

	}

}
