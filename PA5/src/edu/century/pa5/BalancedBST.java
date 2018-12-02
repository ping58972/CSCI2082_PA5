package edu.century.pa5;
/**public class BalancedBST from the package edu.century.finalproject
 * 
 *  Century College, CSCI 2082 Fall 2018.
 *  BalancedBST.java, Programming Balanced Binary Search Tree.
 *  
 *  @author (Ping) Nalongsone Danddank
 *  @version 1.0
 *  @since 12/06/2018
 * */

public class BalancedBST {
	private int data;
	private BalancedBST left, right;
	
	public static void main(String[] args) {
		
		int[] sArr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
		//display preOrder of BalancedBST
		System.out.println("display preOrder of BalancedBST:");
		preOrder(sortedArrayToBalancedBST(sArr, 0, sArr.length-1));
	
		//display inOrder of BalancedBST
		System.out.println("\n\ndisplay inOrder of BalancedBST:");
		inOrder(sortedArrayToBalancedBST(sArr, 0, sArr.length-1));
	
		//display posOrder of BalancedBST
		System.out.println("\n\ndisplay posOrder of BalancedBST:");
		posOrder(sortedArrayToBalancedBST(sArr, 0, sArr.length-1));
	
	}
	
	/* public static BalancedBST sortedArrayToBalancedBST(int arr[], int start, int end)
	 * @Descriptions 
	 * 		to set sorted Array to be balanced for binary tree . 
	 * @Parameter : arr[] - integers
	 * 				start - integer
	 * 				end   - integer
	 * @Precondition : arr must not null.
	 * 					start must small then end
	 * @Postcondition
	 * @Return: BalancedBST object.
	 * @Thorws 	null if arr is null. 
	 * */
	public static BalancedBST sortedArrayToBalancedBST(int arr[], int start, int end) {
			/* Base Case */
		  if (start > end) { 
	            return null; 
	        }
		  /* Get the middle element and make it root */
		  int mid = (start + end) / 2;  
		  BalancedBST node = new BalancedBST(arr[mid]);
		
		  /* Recursively construct the left subtree and make it 
	         left child of root */
		node.setLeft(sortedArrayToBalancedBST(arr, start, mid - 1));
		

        /* Recursively construct the right subtree and make it 
         right child of root */
		node.setRight(sortedArrayToBalancedBST(arr, mid + 1, end)); 
        
        return node; 
	}
	
	/* public static void preOrder(BalancedBST node)
	 * @Descriptions 
	 * 		to print preOrder node tree. 
	 * @Parameter : node - BalancedBST
	 * @Precondition : node must not null.
	 * @Postcondition
	 * @Return 
	 * @Thorws 	null if node is null.
	 * */
   public static void preOrder(BalancedBST node) { 
        if (node == null) { 
            return; 
        } 
        System.out.print(node.getData() + " "); 
        preOrder(node.getLeft()); 
        preOrder(node.getRight()); 
    } 
    
	/* public static void inOrder(BalancedBST node)
	 * @Descriptions 
	 * 		to print inOrder node tree. 
	 * @Parameter : node - BalancedBST
	 * @Precondition : node must not null.
	 * @Postcondition
	 * @Return 
	 * @Thorws 	null if node is null.
	 * */
   public static void inOrder(BalancedBST node) { 
       if (node == null) { 
           return; 
       } 
       
       inOrder(node.getLeft());
       System.out.print(node.getData() + " ");
       inOrder(node.getRight()); 
   } 
   
	/* public static void posOrder(BalancedBST node)
	 * @Descriptions 
	 * 		to print posOrder node tree. 
	 * @Parameter : node - BalancedBST
	 * @Precondition : node must not null.
	 * @Postcondition
	 * @Return 
	 * @Thorws 	null if node is null.
	 * */
   public static void posOrder(BalancedBST node) { 
       if (node == null) { 
           return; 
       } 
       
       posOrder(node.getLeft());
       posOrder(node.getRight());
       System.out.print(node.getData() + " ");
   }
	/*public BalancedBST(String data)
	 * @Descriptions 
	 * 		to construct class with data. 
	 * @Parameter: 
	 * 		data - String.
	 * @Precondition : data not null.
	 * @Postcondition
	 * @Return
	 * @Thorws 	: null exception.
	 * */
    public BalancedBST(int data){
		setData(data);
		setRight(null);
		setLeft(null);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BalancedBST getLeft() {
		return left;
	}

	public void setLeft(BalancedBST left) {
		this.left = left;
	}

	public BalancedBST getRight() {
		return right;
	}

	public void setRight(BalancedBST right) {
		this.right = right;
	}	
    
    
    

}

