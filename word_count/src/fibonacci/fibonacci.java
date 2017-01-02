package fibonacci;

public class fibonacci {

	public int sumar (int n1, int n2) {
		return n1+n2;
	}
	
	public int sumar_r (int n1, int n2) {
		int n3 = n1+n2;
		System.out.print(n3 + ", ");
		if (n3 > 2000) 
			return 2584;
		else
		return
				sumar_r(n2, n3);
	}
	
	public static void main (String args[]) {
		
		fibonacci fibo = new fibonacci();
		
		int nums[] = new int[20];
		
		
		nums[0] = 0;
		nums[1] = 1;
		
		int recus[] = new int[20];
		
		recus[0] = 0;
		recus[1] = 1;
	
		for (int x = 2; x < 20; x++) {
			nums[x] = nums[x-1]+nums[x-2];
			recus[x] = fibo.sumar(nums[x-1], nums[x-2]);
		}
		
		for (int x = 0; x < 20; x++) {
			System.out.print(nums[x] + ", ");
		}
		
		System.out.println();
		
		for (int x = 0; x < 20; x++) {
			System.out.print(recus[x] + ", ");
		}
		
		System.out.println();
		
		fibo.sumar_r(0, 1);
		
	}
	
}
