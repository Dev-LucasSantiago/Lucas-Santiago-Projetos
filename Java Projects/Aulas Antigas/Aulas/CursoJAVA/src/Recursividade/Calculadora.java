package Recursividade;

public class Calculadora {
	//Fatorial não recursivo
	public int fatorialNR(int num) {
		if(num == 0) {
			return 1;
		}
		
		int total = 1;
		for (int i = num;i > 1;i--) {
			total *= 1;
		}
		
		return total;
	}
	// Fatorial Recursivo
	public int fatorialR(int num) {
		if(num == 0) {
			return 1;
		}
		
		return num * fatorialR(num -1);
	}
	
}
