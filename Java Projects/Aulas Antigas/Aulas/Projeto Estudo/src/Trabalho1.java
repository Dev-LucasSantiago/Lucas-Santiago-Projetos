import java.util.Scanner;

public class Trabalho1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[][] mat = new int [4][4];
		
		int i,j,Quant;
		
		
		System.out.println("Digite o valor da matriz: ");
		Quant = leitor.nextInt();
		
	     
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
     			mat[i][j] = Quant ;
     		}
		}
     		
	     for(i=0;i<4;i++) {
	    	 for(j=0;j<4;j++) {
	    		 
	    		 if(i == j){
	    			 System.out.println("---Matriz Diagonal Primária: " + "["+i+"]"+"["+j+"] = "+mat[i][j]);
	    		 }
	    	 }
	     }
	     System.out.println("");
	     for(i=0;i<4;i++) {
	    	 for(j=0;j<4;j++) {
	    		 if(j+i == 3){
	    			 System.out.println("---Matriz Diagonal Secundária: " + "["+i+"]"+"["+j+"] = "+mat[i][j]);
	    		 }
	    	 }
	     }
	     
	     }

	}


