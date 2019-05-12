package exer_libro;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class exer_17_5 {

	
	public static void main (String a[]) {
		List lista = new ArrayList();
		
		lista.add(new Integer(1));
		
		lista.add(new String("'1'"));
		
		lista.add(new Double(1.1));
		
		System.out.println(lista.toString());
		
		
		Iterator enumera;
		
		enumera = lista.iterator();
		
		while (enumera.hasNext())
			System.out.println(enumera.next());
		
		Stack pila = new Stack();
		
		pila.elements();
		
	}
	
}
