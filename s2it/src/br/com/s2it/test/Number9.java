package br.com.s2it.test;
/**
 * Considerei que nenhuma alteração pudesse ser feita na classe BinaryTree enviada.
 * @author Iorran
 */
public class Number9 {
	static int value = 0;
	public static void main(String[] args) {
		BinaryTree a = new BinaryTree(); 
		a.valor = 10;
		
		BinaryTree b = new BinaryTree();
		b.valor = 5;

		BinaryTree c = new BinaryTree();
		c.valor = 3;
		
		BinaryTree d = new BinaryTree();
		d.valor = 1;
		
		BinaryTree e = new BinaryTree();
		e.valor = 22;

		a.left = b;  
		a.right = c; 
		 
		c.left = d; 
		c.right = e; 
		
		sumChild(a);
	}

	private static void sumChild(BinaryTree tree) {
		value += tree.valor; 
		System.out.println(value);
		
		if(hasRightChild(tree)) { 
			sumChild(tree.right);
		}

		if(hasLeftChild(tree)) { 
			sumChild(tree.left);
		}
		
	} 

	private static boolean hasRightChild(BinaryTree tree) {
		return tree.right != null;
	}

	private static boolean hasLeftChild(BinaryTree tree) {
		return tree.left != null;
	} 
}
