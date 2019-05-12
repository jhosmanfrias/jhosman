package ejercicios;

public class num4 {

	
	public static void main (String[] args) {
		double[] nums = new double[100];
		
		int suma = 0;
		int media = 0;
		
		for (int x = 0; x < 100; x++) {
			nums[x] = x+1;
			suma += nums[x];
		}
		
		media = suma / 100;
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
	}
}
