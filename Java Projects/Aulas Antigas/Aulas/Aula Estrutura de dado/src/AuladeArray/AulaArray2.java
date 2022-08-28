package AuladeArray;

public class AulaArray2 {

	public static void main(String[] args) {
		double[] Temperatura = new double[10];

		Temperatura[0] = 33.3;
		Temperatura[1] = 24;
		Temperatura[2] = 31;
		Temperatura[3] = 36;
		Temperatura[4] = 34;
		Temperatura[5] = 33.5;
		Temperatura[6] = 32;

		for(double temp : Temperatura) {
			System.out.println("A temperatura do dia é: "+temp);
		}

	}

}
