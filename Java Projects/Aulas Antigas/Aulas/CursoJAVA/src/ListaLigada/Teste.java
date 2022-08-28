package ListaLigada;

public class Teste {

	public static void main(String[] args) {
		ListaEncadeada<String> Lista =  new ListaEncadeada<>();
		
		Lista.adiciona("CE");
		Lista.adiciona("DF");
		Lista.adiciona("SP");
		Lista.adiciona("RJ");
		Lista.adiciona("RN");
		Lista.adiciona("RN");
		
		System.out.println("Tamanho da lista: "+Lista.getTamanho());
		System.out.println(Lista);
	}

}
