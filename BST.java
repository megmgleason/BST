
public class BST {
	
	Node root;
	private int counter; //number of elements in the tree aka size

	//The default constructor. root is initialized to null, and the counter is
	//set to zero
	BST(){
		this.root = null;
		this.counter = 0;
	}//BST
	
	class Node {
		private int key;
		private Node parent;
		private Node leftChild;
		private Node rightChild;
		
		//The default constructor. Key should be initialized to -1, and all fields
		//should be initialized to null
		Node(){
		this.key = -1;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
		}//default constructor
		
		//Creates a new node where the key is initialized, but all other fields
		//are null.
		Node(int key){
			this.key = key;
			this.parent = null;
			this.leftChild = null;
			this.rightChild = null;
		}
		
		//Creates a new node where all fields are initialized according to the
		//parameters.
		Node(int key, Node parent, Node leftChild, Node rightChild){
			this.key = key;
			this.parent = parent;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}
		
		//Getters and Setters for all fields
		public int getKey() {
			return this.key;
		}//getKey
		
		public Node getParent() {
			return this.parent;
		}
		
		public Node getLeftChild() {
			return this.leftChild;
		}
		
		public Node getRightChild() {
			return this.rightChild;
		}
		
		public void setKey(int newKey) {
			this.key = newKey;
		}
		
		public void setParent(Node newParent) {
			this.parent = newParent;
		}
		
		public void setLeftChild(Node newLeftChild) {
			this.leftChild = newLeftChild;
		}
		
		public void setRightChild(Node newRightChild) {
			this.rightChild = newRightChild;
		}
		
		
	}//Node
	
	//public methods
	
	//This method should return the number of elements stored within the
	//tree.
	public int size() {
		return this.counter;
	} //size
	
	//Inserts a new element into the tree. Duplicates are not allowed. If the
	//element is already in the tree, print “Element is already in the tree!”
	//ASK ~ can we make an additional object instance var? I want to make an array that
	// holds all the numbers to speed up checking if an element is in the list
	public void insert(int element) {
		Node current = new Node();
		boolean stillInserting; 
		if (size() == 0) {
		current.setKey(element);
		root = current;
		this.counter++;
		} else {
			current = root;
			stillInserting = true;
			while (stillInserting == true) {
				//less than
				if(element < current.getKey()) {
					Node leftChild = current.getLeftChild();
					if (leftChild != null) {
						current = leftChild;
					} else {
						current.setLeftChild(new Node (element, current, null, null));
						stillInserting = false;
						this.counter++;
					} //else
				} //if
				//greater than
				if(element > current.getKey()) {
					Node rightChild = current.getRightChild();
					if(rightChild != null) {
						current = rightChild;
					} else {
						current.setRightChild(new Node(element, current, null, null));
						stillInserting = false;
						this.counter++;
					} //else
				} //if
				if (element == current.getKey()) {
					System.out.println("Element is already in the tree!");
					stillInserting = false;
				} //if
			} //else
		} //while
		
	} //insert
	
	//Removes the specified element from the tree. If the element is not
	//currently stored in the tree, print “Element not found!”.
	void delete(int element) {
		
	}//delete
	
	
	//Prints out all of the elements in the tree according to their order in a
	//preorder traversal.
	void preorder() {
		
	}//preorder
	
	//Prints out all of the elements in the tree according to their order in a
	//postorder traversal
	//traverse left, traverse right, visit node
	void postorder() {
		//pseudocode:
		//if node is null, return
		//else, postorder (node.getLeftChild())
		//	postorder(node.getRightChild())
		//visit current node (print)
		Node current = this.root;
		if (current.getKey() != -1) {
			current = current.getLeftChild();
			postorder();
			current = current.getRightChild();
			postorder();
			System.out.println(current.getKey() + " ");
		} else {
			System.out.println(",");
		} 
		
	}//postorder
	
	//Prints out all of the elements in the tree according to their order in an
	//inorder traversal
	void inorder() {
		
	}//inorder
	
	
	//private methods
	//- preorderHelper(Node current)
	//- postorderHelper(Node current)
	//- inorderHelper(Node current)
	//should these be void or returning?
	
}//BST
