package ejercicios;

import javax.swing.JOptionPane;

public class num3 {

	
	public static void main (String[] args) {
		String lectura = JOptionPane.showInputDialog("Limite: ");
		int limite = Integer.parseInt(lectura);
		
		int primo;
		
		int cuenta;
		
		int [] arreglo = new int[limite];
		
		for (int x=0; x < limite; x++) {
		cuenta = 0;
		primo = (int) (Math.random()*(500-1000)+1000);
		
			for (int i = primo; i>0; i--) {
				if (primo%i == 0)
					cuenta++;
				else
					continue;
			}
		if (cuenta == 2) {
			arreglo[x] = primo;
			System.out.println("Primo encontrado: " + primo);
			
		}
		else {
			System.out.println("Primo falló: " + primo);
			x--;
		}
		
		}
		
		System.out.println("PRIMOR MAYOR: " + mayor(arreglo, limite));
	}

	private static int mayor(int[] arreglo, int lim) {
		int m = 0;
		
		for (int y = 0; y < lim; y++) {
			if (arreglo[y] > m)
			m = arreglo[y];
		}
		return m;
	}
}
