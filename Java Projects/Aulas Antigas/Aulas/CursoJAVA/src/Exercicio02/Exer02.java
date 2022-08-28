package Exercicio02;

public class Exer02 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "01-0111128";
		conta.agencia= "01";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
		System.out.println("Saque efetuado com Sucesso");
		conta.consultarSaldo();
		}else {
			System.out.println("Não foi possível realizar Saque. Saldo insuficiente");
		}
		
		saqueEfetuado = conta.realizarSaque(481);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com Sucesso");
			conta.consultarSaldo();
			}else {
				System.out.println("Não foi possível realizar Saque. Saldo insuficiente");
			}
		System.out.println("--Deposito de 500 reais na conta--");
		conta.depositar(500);
		conta.consultarSaldo();
		
	}

}
