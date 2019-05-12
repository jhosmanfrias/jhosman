/**
 * Declarar un array de tipo String de 40 elementos. Llamar al método 
 * fill() para inicializar la primera mitad a “Domingo” y la segunda a “Lunes”.
 */

package exer_libro;

import java.util.Arrays;
import java.util.Enumeration;

public class fill {

	final static int num = 40;
	
	public static void main (String ars[]) {
		
		String[] lista = new String[num];
		
		Arrays.fill(lista, 0, num/2, new String("Domingo"));
		
		Arrays.fill(lista, num/2, num, new String("Lunes"));
		
		for (int x = 0; x < lista.length; x++)
		System.out.println(x + lista[x]);
		
	}
	
}
