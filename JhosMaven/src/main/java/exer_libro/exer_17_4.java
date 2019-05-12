package exer_libro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class exer_17_4 {

	public static void main(String[] args) {
		
		LinkedList<Persona> lista = new LinkedList<Persona>();
		
		lista.addLast(new Persona());
		
		Collection<Persona> lista2 = new LinkedList<Persona>(); 
				
		lista2 = Collections.unmodifiableCollection(lista);
		
		lista2.add(new Persona());

	}

}


class Persona {
	
}