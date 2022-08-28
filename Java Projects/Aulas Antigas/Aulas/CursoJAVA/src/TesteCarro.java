
public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.modelo = "HB20";
		van.marca = "Hundai";
		van.numPassageiros = 5;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		van.exibirAutonomia();
		
		double Autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia do carro é: "+van.obterAutonomia());
		
		double qtdCombustivel10 = van.cacularCombustivel(10);
		double qtdCombustivel15 = van.cacularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = "+qtdCombustivel10 );
		System.out.println("qtdCombustivel15 = "+qtdCombustivel15 );
	}

}
