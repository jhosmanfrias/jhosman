package ejercicios;

import javax.swing.JOptionPane;

/**
 * Crea un array de 10 posiciones de números con valores pedidos por teclado. 
 * Muestra por consola el indice y el valor al que corresponde. 
 * Haz dos métodos, uno para rellenar valores y otro para mostrar.
 * @author Dubraska
 *
 */

public class num1 {
	
	private static int limit = 10;

	private int [] arreglo = new int[limit];
	
	protected void rellenar () {
		
		for (int x = 0; x < limit; x++) {
			String leer = JOptionPane.showInputDialog("Ingrese valor numérico: ");
			arreglo[x] = Integer.parseInt(leer);
		}
		
	}
	
	public void mostrar () {
		for (int x = 0; x < limit; x++) {
			System.out.println("["+x+"]: "+arreglo[x]);
		}
	}
	
	public static void main (String[] argumentos) {

		num1 instancia = new num1();
		
		instancia.rellenar();
		
		instancia.mostrar();
		
	}
	
}
