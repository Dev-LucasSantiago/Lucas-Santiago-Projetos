package TreeBinary;

//Declarações de classe TreeNode e Tree por uma árvore de pesquisa binária.
public class TreeNode<T extends Comparable<T>> {
	// membros de acesso de pacote
	TreeNode<T> leftNode;
	
	T data;// valor do nó
	TreeNode<T> rightNode;
	
	// construtor inicializa os dados e os torna um nó de folha
	public TreeNode(T nodeData) {
		data = nodeData;
		leftNode = rightNode = null;// o nó não tem nenhum filho
	}
	
	// localiza ponto de inserção e insere novo nó; ignora os valores duplicados
	public void insert(T insertValue) {
		// insere na subárvore esquerda
		if(insertValue.compareTo(data) < 0) {
			// insere novo TreeNode
			if(leftNode == null) leftNode = new TreeNode<T>(insertValue);
			else leftNode.insert(insertValue);// continua percorrendo a subárvore esquerda recursivamente	
		}
		// insere na subárvore direita
		else if(insertValue.compareTo(data) > 0) {
			// insere novo TreeNode
			if(rightNode == null) rightNode = new TreeNode<T>(insertValue);
			else rightNode.insert(insertValue);// continua percorrendo a subárvore direita recursivamente
		}
	}
}// fim da classe TreeNode
