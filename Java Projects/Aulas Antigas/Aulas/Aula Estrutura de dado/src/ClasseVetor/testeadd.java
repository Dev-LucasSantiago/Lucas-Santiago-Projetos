package ClasseVetor;

public class testeadd {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		
		System.out.println(vetor);
		
		vetor.adiciona(0,"A");
		System.out.println(vetor);
		
		vetor.adiciona(3,"Z");
		System.out.println(vetor);
		
		vetor.adiciona(0,"W");
		System.out.println(vetor);
		
		vetor.adiciona(0,"B");
		System.out.println(vetor);
		
		vetor.adiciona(0,"T");
		System.out.println(vetor);
		
		vetor.adiciona(0,"V");
		System.out.println(vetor);
		
		vetor.remove(10);
		
		System.out.println(vetor);
		
		
		System.out.println(vetor.busca(2));
		
		System.out.println(vetor.busca("F"));
		

	}

}
