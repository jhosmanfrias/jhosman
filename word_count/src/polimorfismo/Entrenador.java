package polimorfismo;

public class Entrenador extends Futbolista {

	public void Entrenar () {
		System.out.println("El Entrenador entrena sin nombre ");
	}
	
	public void Entrenar (String e) {
		System.out.println("El Entrenador entrena: " +e);
	}

	@Override
	public void Jugar(String a) {
		// TODO Auto-generated method stub
		
	}
}
