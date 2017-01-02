package palindrome;

public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] palabra = args[0].toCharArray();
		
		System.out.println("Palabra a evaluar: " + args[0]);
		
		int len = args[0].length();
				
		boolean es = true;
		
		int i = 0 ;
		int f = len-1;
		do {

			if (palabra[i] == palabra[f])
				{i++; f--;}
			else {
				es = false;
				break;
			}
			
		} while (i < f);
		
		System.out.println("Resultado: " + es);
	}
}
