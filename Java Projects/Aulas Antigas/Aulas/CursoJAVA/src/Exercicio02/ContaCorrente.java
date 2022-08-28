package Exercicio02;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) {
		//Tem Saldo
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		}else {//N�o tem Saldo
			if(especial) {
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false;//N�o � especial e n�o tem saldo na conta
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo da conta = "+ saldo);
	}
}
