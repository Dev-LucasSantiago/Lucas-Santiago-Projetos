package Aula06;

public class Main {

	public static void main(String[] args) {
		String[] estados = new String[10];
		
		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";
		estados[3] = "DF";
		estados[4] = "AM";
		estados[5] = "PA";
		estados[6] = "AP";
		estados[7] = "PB";
		estados[8] = "RN";
		estados[9] = "SP";
		
		for(int i = 0; i < estados.length; i++) {
			System.out.println("Estados " + (i+1) + " : "+estados[i]);
		}
		
		
		

	}

}
