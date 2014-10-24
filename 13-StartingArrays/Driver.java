public class Driver{
    public static void main(String[] args){
        Array a = new Array();
	int[] array = {1, 2, 13, 2, 1, 13};
	System.out.println(a.frontPiece(array)); // {1, 2}
	System.out.println(a.sum13(array)); // 4
    }
}
