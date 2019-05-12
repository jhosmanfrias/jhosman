package e_datos;

import java.util.HashSet;
import java.util.Set;

public class My_Set {

	public static void main (String argvs[]) {
	
		Set<String> s1 = new HashSet<String>(2);
		
		System.out.println(s1.size());
		
		s1.add("2");
		s1.add("Dos");
		
		System.out.println(s1.size());
		
		s1.add("Tres");
		
		System.out.println(s1.size() + ": " + s1.toString());
		
		s1.remove("Cuatro");
		
		System.out.println(s1.size() + ": " + s1.toString());
		
		s1.add("Dos");
		
		System.out.println(s1.size() + ": " + s1.toString());
		
		
	}
	
}
