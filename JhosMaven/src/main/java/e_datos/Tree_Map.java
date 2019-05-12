package e_datos;

import java.util.Iterator;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		tree.put(3, "Tres");
		tree.put(1, "Uno");
		tree.put(8, "Ocho");
		tree.put(82, "Ocho");
		System.out.println(tree);
		System.out.println(tree.firstKey() + ": " + tree.firstEntry());
		System.out.println(tree.lowerEntry(tree.lastKey()));
		System.out.println(tree.floorEntry(8));
		
		
		Iterator ite = tree.keySet().iterator();
		while (ite.hasNext()) {
			System.out.println(tree.get(ite.next()));
		}
	}

}
