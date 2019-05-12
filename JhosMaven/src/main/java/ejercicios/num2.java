package ejercicios;

import javax.swing.JOptionPane;

public class num2 {
	
	int limit;
	  
	
	public int[] rellenar (int min, int max) {
		
		String lectura = JOptionPane.showInputDialog("Tamaño máximo array: ");
		
		limit = Integer.parseInt(lectura);
				
		int [] arreglo = new int[limit];
				
		for (int i = 0; i < limit; i++) {
			arreglo[i] = generar(min, max);
		}
		
		return arreglo;
	}
	
	public void mostrar (int[] a) {
		for (int x= 0; x < limit; x++){
			System.out.println("["+x+"]: " +a[x]);	
		}
		
	}
	
	public int sumar (int[] a) {
		int suma = 0;
		for (int x= 0; x < limit; x++){
			suma+=a[x];	
		}
	return suma;	
	}
	
	private int generar (int min, int max) {
		return (int) (Math.random()*(min-max)+max);
	}
	
	private void generar2 () {
		double as = Math.random();
		System.out.println(as);
		
		System.out.println((as*(0-5)));
	}
	
	public static void main (String[] args) {
		
		num2 n2 = new num2();
		
		n2.generar2();
		
		//int[] arreglo = n2.rellenar(0, 9);
		
		//n2.mostrar(arreglo);
		
		//System.out.println("Suma total: " + n2.sumar(arreglo));
	}
	
}
