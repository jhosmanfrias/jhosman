package polimorfismo;

public class Jugador extends Futbolista {
	
	String nombre;



	public Jugador(String n) {
		nombre = n;
	}



	@Override
	public void Jugar(String a) {
		System.out.println("El Futbolista juega: " + nombre + " " + a);
		
	}

}
