package Primeira;

public class FuncRecursiva {
	
	public static void main(String[] args) {
		int []vetor = {121,57,84,21,54,67,99,101};
		int menor = buscaRecursivaMenor(vetor, 0 , vetor.length-1);
		
		System.out.println(menor);

	}
	private static int buscaRecursivaMenor(int[] v, int i, int f) {
		if(i == f)
			return v[i];
		else {
			int n1, n2;
			int m;
			
			m = (i + f) / 2;
			n1 = buscaRecursivaMenor(v , i, m);
			n2 = buscaRecursivaMenor(v, m+1, f);
			
			if (n1 < n2) return n1;
			else return n2;
		}
	}
}
