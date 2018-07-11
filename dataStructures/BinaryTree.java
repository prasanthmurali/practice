package dataStructures;

public class BinaryTree {
	
	Node root;
	public BinaryTree(int key) {
		root = new Node(key);
	}
	public BinaryTree() {
		root=null;
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right  =new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.printInOrder();
	}
	// can also be pre-order or in order, similar approaches
	void printInOrder() {
		printInOrder(root);
	}
	
	// can also be pre-order or in order, similar approaches
	void printInOrder(Node node) {
		if(node==null)
			return;
		printInOrder(node.left);
		System.out.println(node.key+" ");
		printInOrder(node.right);	
	}
}
class Node{
	int key;
	Node left,right;
	public Node(int item) {
		key = item;
		left = right = null;
	}
}