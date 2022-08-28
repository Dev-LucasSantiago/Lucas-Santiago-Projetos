package AuladeArray;

public class AulaArray {

	public static void main(String[] args) {	
		double[] Temperatura = new double[365];
		
		Temperatura[0] = 33.3;
		Temperatura[1] = 24;
		Temperatura[2] = 31;
		Temperatura[3] = 36;
		Temperatura[4] = 34;
		Temperatura[5] = 33.5;
		Temperatura[6] = 32;
		
		for (int i = 0; i < Temperatura.length; i++) {
			System.out.println("O valor da temperatura do dia "+(i +1)+" �: "+ Temperatura[i]);
		}

	}

}
