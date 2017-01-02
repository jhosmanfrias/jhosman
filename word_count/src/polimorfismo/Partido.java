package polimorfismo;

public class Partido {

	private static double pi = 3.14;
	
	public static void main(String[] args) {

	Futbolista Iniesta = new Jugador("Andrés");

	Iniesta.Jugar("Iniesta");
	
	Iniesta.Entrenar("Zidane");
	
	Futbolista Zidane = new Entrenador();
	
	Zidane.Entrenar("Zidane");
	
	}

}
