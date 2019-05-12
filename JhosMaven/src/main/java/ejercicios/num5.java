package ejercicios;

import javax.swing.JOptionPane;

public class num5 {
	
	static char[] letras = {'A','B', 'C', 'D', 'E', 'F' ,'G', 'H', 'I', 'J'};
	
	static int aaa;

	public static void main(String[] args) {
		System.out.print(aaa);
		System.out.println(": a");
		
		// TODO Auto-generated method stub
		int lectura = 0;
		String fainal = "";
		
		while (true) {
		
			String leer = JOptionPane.showInputDialog("Posición: ");
			lectura = Integer.parseInt(leer);
			
			if (lectura == -1)
				break;
			else
				fainal += letras[lectura];
			
		}
		
		System.out.println(fainal);
		
		switch (fainal.length()) {
			case 1: System.out.println(1); break;
			case 2: System.out.println(2); break;
			case 3: System.out.println(3); int x; break;
			default: System.out.println("Mayor que 3");
		}
		
		
		String numString="12";
		
		byte numByte=Byte.parseByte(numString);
        System.out.println("byte: "+numByte);

        System.out.println("\n\tEl siguiente es \"comilla\" y \'simple\'");
        
	}

}
