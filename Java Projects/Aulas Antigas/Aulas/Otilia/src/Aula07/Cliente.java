package Aula07;

public class Cliente {
	private String CPF;
	private String NOME;
	@Override
	public String toString() {
		return NOME;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nOME) {
		NOME = nOME;
	}
	public Cliente(String cPF, String nOME) {
		super();
		CPF = cPF;
		NOME = nOME;
	}	
}
