
public class Aula01 {

	public static void main(String[] args) {
			//La�o while
			int i = 1;
			
			while(i <= 5) {
				
				System.out.println("Valor de i: "+i);
				i++;
			}
			
			//La�o Do While
			
			int x = 0;
			
			do {
				x++;
				System.out.println("Valor de x: "+x);
			}while(x<5);
			
			//La�o For
			for(int y=1; y<=5; y=y+1) {
				System.out.println("Valor de y: "+y);
			}
			
			//La�o For Pares 1 a 100 �mpar e PAR
			int a = 1;
			int b = 100;
			for(int h=a; h<=b; h++) {
				if(h%2 == 0) {
					System.out.println("Valor de h: "+h+" � Par!");
				}else {
					System.out.println(h+" � �MPAR");
				}
			}
		    
			
	}
	
}


