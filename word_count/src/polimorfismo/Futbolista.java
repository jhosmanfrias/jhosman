package polimorfismo;

public abstract class Futbolista {

	public abstract void Jugar (String a);
	
	public void Entrenar (String b) {
		
		System.out.println("El Futbolista entrena: " +b);
		
	};
	
	public void Medicar (String c) {};
}
