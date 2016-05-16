//U10416005ªL«Ø¦t
public class BinarySort{
	//Data field
	public Object element;
	public Node left;
	public Node right;
	public Node init;
	//no-arg Constructor
	public BinarySort(){
		
	}
	//two Contructors
	public BinarySort(Object element){
		this(element,null,null);
	}
	public BinarySort(Object element,Node left,Node right){
		this.element = element;
		this.left = left;
		this.right = right;
	}
	//method to move the node
	public void nodeSort(Object e){
		init = new Node(e);
	}
	//method to Add the number to node
	public Node Add(Node node,int e){
		if (node == null) {
			return node = new Node(e);
		}
		if (e < (Integer) node.element) {
			node.left = Add(node.left, e);
		} else {
			node.right = Add(node.right, e);
		}
		return node;
	}
	//method to sort the number
	public void sort(Node node) {
		if (node != null) {
			sort(node.left);
			System.out.print(((Integer) node.element).intValue() + " ");
			sort(node.right);
  		}
	}
}