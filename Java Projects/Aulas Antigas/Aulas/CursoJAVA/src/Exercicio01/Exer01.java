package Exercicio01;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.Ligar();
		
		System.out.println("A l�mpada est� ligada: "+ lampada.ligada);
		
		lampada.Desligar();
		
		System.out.println("A l�mpada est� ligada: "+ lampada.ligada);
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
