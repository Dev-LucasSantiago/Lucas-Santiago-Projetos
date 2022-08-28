package Hash;

public class TesteHash {

	public static void main(String[] args) {
		Hash hash = new Hash(4);
		
		hash.inserir(new Contato(2,"Saulo","999999999"));
		hash.inserir(new Contato(6,"Joao","999999999"));
		hash.inserir(new Contato(13,"Roberta","999999999"));
		hash.inserir(new Contato(12,"Marta","999999999"));
		hash.inserir(new Contato(7,"Maria","999999999"));
		hash.inserir(new Contato(8,"Jose","999999999"));
		
		System.out.println(hash);
		
		Contato c = hash.buscar(2);
		if(c != null) {
			System.out.println("Dado buscado: "+c);
		}
	}

}
