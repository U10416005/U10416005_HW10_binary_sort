//U10416005ªL«Ø¦t
public class Node{
	//Data field
	public Object element;
	public Node right;
	public Node left;
	//no-arg constructor
	public Node(){
		
	}
	//two constructors
	public Node(Object element){
		this(element,null,null);
	}
	public Node(Object element,Node left,Node right){
		this.element = element;
		this.left = left;
		this.right = right;
	}
}