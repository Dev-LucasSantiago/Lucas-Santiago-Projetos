package TreeBinary;
//definição da classe Tree
public class Tree<T extends Comparable<T>>{
	
	private TreeNode<T> root;
	// construtor inicializa uma Tree de inteiros vazia
	public Tree() {
		root = null;
	}
	// insere um novo nó na árvore de pesquisa binária
	public void insertNode(T insertValue) {
		if(root == null) root = new TreeNode<T>(insertValue);// cria o nó raiz
		else root.insert(insertValue);// chama o método insert
	}
	// inicia o percurso na pré-ordem
	public void preorderTraversal() {
		preorderHelper(root);
	}
	// método recursivo para realizar percurso na pré-ordem
	private void preorderHelper(TreeNode<T> node) {
		if(node == null) return;
		
		System.out.printf("%s ",node.data);// gera saída de dados do nó
		preorderHelper(node.leftNode);// percorre subárvore esquerda
		preorderHelper(node.rightNode);// percorre subárvore direita
	}
	// inicia percurso na ordem
	public void inorderTraversal() {
		inorderHelper(root);
	}
	// método recursivo para realizar percurso na ordem
	private void inorderHelper(TreeNode<T> node) {
		if(node == null) return;
		
		inorderHelper(node.leftNode);// percorre subárvore esquerda
		System.out.printf("%s ",node.data);// gera saída de dados do nó
		inorderHelper(node.rightNode);// percorre subárvore direita
	}
	// inicia percurso na pós-ordem
	public void postorderTraversal() {
		postorderHelper(root);
	}
	// método recursivo para realizar percurso na pós-ordem
	private void postorderHelper(TreeNode<T> node) {
		if(node == null) return;
		
		postorderHelper(node.leftNode);// percorre subárvore esquerda
		postorderHelper(node.rightNode);// percorre subárvore direita
		System.out.printf("%s ",node.data);// gera saída de dados do nó
	}
	
}// fim da classe Tree
