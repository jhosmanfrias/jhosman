package e_datos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class avoid_dups {
	
	public static void main (String[] arg) {
		HashMap<articulo, Integer> arts = new HashMap<articulo, Integer>();
		
		articulo laptop1 = new articulo("laptop", 1000);
		articulo laptop2 = new articulo("laptop", 1000);
				
		arts.put(laptop1, 1);
		arts.put(laptop2, 2);
		
		System.out.println("Size:" + arts.size());
		printH(arts);
	}
	
	public static void printH (HashMap<articulo, Integer> arts){
		Set<articulo> art = arts.keySet();
		for (articulo x: art) {
			System.out.println("key: " + x + " > valor: " + arts.get(x));
		}
	}
}

class articulo {
	
	public String toString() {
		return "Nombre: " + this.nombre + "; Precio: " + this.precio;
	}
	
	public boolean equals (Object o){
		if (o instanceof articulo) {
			articulo i = (articulo) o;
			return (i.nombre.equals(this.nombre));
		}
		else return false;
	}
	
	String nombre; double precio;
	
	void setNombre (String n) {
		this.nombre = n;
	}
	String getNombre() {
		return this.nombre;
	}
	void setPrecio (double p) {
		this.precio = p;
	}
	double getPrecio () {
		return this.precio;
	}
	articulo (String n, double d) {
		this.nombre = n;
		this.precio = d;
	}
    public int hashCode(){
        int hashcode = 0;
        hashcode = (int) (precio*20);
        hashcode += nombre.hashCode();
        System.out.println(hashcode);
        return hashcode;
    }
	
}


