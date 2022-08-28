package Buscas;

public class Busca {
	
	
	public static void main(String[] args) {
		int array[] = {3,4,5,6,7,8,9,10};
	
		
		int elemento = 10;
		
		int resultado = buscaMaior(array,elemento);
		
		if(resultado <0) {
			System.out.println("Elemento não encontrado!");
		}else {
			System.out.println("Elemento encontrado na posição: "+resultado);
		}
		
		
	}
	public static int buscaMaior(int[] array,int elemento) {
		return buscaRecursivaMaior(array,elemento,0,array.length -1);
	}
	
	public static int buscaRecursivaMaior(int[] array,int elemento,int menor, int maior) {
		int media = (maior + menor)/2 ;
		if(menor > maior) {
			return -1;
		}
		if(array[media] == elemento) {
			return media;
		}
		if(array[media] < elemento) {
			return buscaRecursivaMaior(array,elemento,media+1,maior);
		}else {
			return buscaRecursivaMaior(array,elemento,menor, media -1);
		}
	}
}
