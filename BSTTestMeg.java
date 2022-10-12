
public class BSTTestMeg {

	public static void main(String[] args) {
		//testing size()
		BST bst = new BST();
		System.out.println("testing size  ");
		System.out.println("Expecting: 0. 	Actual: " + bst.size());
		System.out.println("");
		
		System.out.println("testing insert  ");
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		System.out.println("size - expecting: 3. 	Actual : " + bst.size());
		System.out.println("print root: " + bst.root.getKey());
		System.out.println("print tree - expecting: 1, 2, 3. 	Actual: " + bst.root.getKey() + ", " + bst.root.getRightChild().getKey() + " ," + bst.root.getRightChild().getRightChild().getKey());
		System.out.print("inserting 3, expecting error message. Actual: ");
		bst.insert(3);
		bst.insert(0);
		System.out.println("print root and left child. Expecting: 1, 0. 	Actual: " + bst.root.getKey() + " ," + bst.root.getLeftChild().getKey() );
		System.out.println("size - expecting 4. 	Actual : " + bst.size());

		
		//go in order of how you implement and test each one super well before moving on
	

	}

}
