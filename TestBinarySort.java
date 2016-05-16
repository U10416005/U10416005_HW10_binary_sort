//U10416005ªL«Ø¦t
public class TestBinarySort{
	//main method
	public static void main(String[] args){
		//numbers array for the node
		int[] dig ={1,3,2,4,6,5,7,9,8,10};
		//invoke BinarySort
		BinarySort bs = new BinarySort(new Integer(dig[0]));
		bs.nodeSort(new Integer(dig[0]));
		//add the number into Node
		for(int i = 1;i<dig.length;i++){
			bs.Add(bs.init,new Integer(dig[i]));
		}
		//sort the number in the node
		bs.sort(bs.init);
	}
}