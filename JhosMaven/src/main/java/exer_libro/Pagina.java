package exer_libro;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Pagina implements Comparable{

	private String s;
	
	private Pagina (String s) {
	this.s = s;	
	}
	
	public static void main (String [] args) {
		
		String a;
		
		a = JOptionPane.showInputDialog("Ingrese num: ");
		
		int num = Integer.parseInt(a);
		
		Pagina [] pagina = new Pagina[num];
		
		for (int x = 0; x < pagina.length; x++) {
			String leer = JOptionPane.showInputDialog("Valor ["+x+"]: ");
			pagina[x] = new Pagina(leer);
			System.out.println(pagina[x]);
		}
		
		Arrays.sort(pagina);
		
		for (int x = 0; x < pagina.length; x++) {
			System.out.println(pagina[x]);
		}
		
	}
	
	public String toString () {
		return s;
	}

	public int compareTo(Object o) {
		Pagina p = (Pagina) o;
		//int c = 
				return this.s.compareTo(p.toString());
		/*
		System.out.println(c);
		if (c == 0) 
			return 0;
		else if (c > 0)
			return 1;
		else
			return -1;*/
	}
	
	
}
