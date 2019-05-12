package e_datos;

import java.util.Vector;

public class My_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v1 = new Vector<String>(3);
		
		System.out.println(v1.size() +"_"+ v1.capacity() +": "+v1.toString());
		
		v1.add("Dos");
		v1.add("Tres");
		v1.add("Dos");
	
		
		System.out.println(v1.size() +"_"+ v1.capacity() +": "+v1.toString());
		
		System.out.println(v1.get(2));
		
	}

}
