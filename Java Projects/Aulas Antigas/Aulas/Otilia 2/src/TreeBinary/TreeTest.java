package TreeBinary;
import java.security.SecureRandom;
//Programa de teste da árvore binária.
public class TreeTest {

	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		SecureRandom randomNumber = new SecureRandom();
		
		System.out.println("Inserting the following values: ");
		// insere 10 inteiros aleatórios de 0 a 99 na árvore
		for(int i = 1; i <= 10; i++) {
			int value = randomNumber.nextInt(100);
			System.out.printf("%d ", value);
			tree.insertNode(value);
		}
		System.out.printf("%n%nPreorder Traversal%n");
		tree.preorderTraversal();
		
		System.out.printf("%n%nInorder Traversal%n");
		tree.inorderTraversal();
		
		System.out.printf("%n%nPostorder Traversal%n");
		tree.postorderTraversal();
		System.out.println();
	}

}// fim da classe TreeTest
