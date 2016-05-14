//U10416005ªL«Ø¦t
public class TestBinarySort{
	public static void main(String[] args){
		int[] dig ={1,3,2,4,6,5,7,9,8,10};
		BinarySort bs = new BinarySort(new Integer(dig[0]));
		for(int i = 0;i<dig.length;i++){
			bs.Add(bs.root,new Integer(dig[i]));
		}
		bs.sort(bs.root);
	}
}