//U10416005�L�ئt
public class BinarySort{
	public Object element;
	public Node root;
	public Node left;
	public Node right;
	public BinarySort(){
		
	}
	public BinarySort(Object element){
		this(element,null,null);
	}
	public BinarySort(Object element,Node left,Node right){
		element = element;
		this.left = left;
		this.right = right;
	}
	public void nodeSort(Object e){
		root = new Node(e);
	}
	public Node Add(Node node,int e){
		if (node == null) {
			return node = new Node(e);
		}
		if (e < (Integer) node.element) {
			node.right = Add(node.left, e);
		} else {
			node.left = Add(node.right, e);
		}
		return node;
	}
	
}