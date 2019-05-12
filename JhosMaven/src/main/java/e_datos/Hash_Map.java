package e_datos;

import java.util.HashMap;
import java.util.Iterator;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> h1 = new HashMap();
		
		//System.out.println(h1);
		h1.put(1, "Dubra2");
		//System.out.println(h1);
		h1.put(2, "Dubra2");
		//System.out.println(h1);
		h1.put(11, "Josbert");
		
		
		Iterator<Integer> ite = h1.keySet().iterator();
		
		for (;ite.hasNext();) {
			Integer k = ite.next(); 
			System.out.println(k + h1.get(k));
		}
	}

}
