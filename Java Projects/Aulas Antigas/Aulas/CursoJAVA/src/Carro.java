
public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: "+capCombustivel*consumoCombustivel);
	}
	
	double obterAutonomia() {
		return capCombustivel*consumoCombustivel;
	}
	
	double cacularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
