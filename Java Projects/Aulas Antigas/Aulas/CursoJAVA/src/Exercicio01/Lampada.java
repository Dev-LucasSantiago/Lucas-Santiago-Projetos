package Exercicio01;

public class Lampada {
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tiposAbajur;
	
	boolean ligada;
	
	void Ligar() {
		ligada = true;
	}
	
	void Desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("A lâmpada está ligada!");
		}else {
			System.out.println("A lâmpada está desligada!");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			Desligar();
		}else {
			Ligar();
		}
	}
	
}
